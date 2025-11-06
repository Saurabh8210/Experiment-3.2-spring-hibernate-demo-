package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class StudentDAO {
    private SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Student.class)
            .buildSessionFactory();

    public void addStudent(Student s) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.save(s);
        session.getTransaction().commit();
    }

    public List<Student> getAllStudents() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<Student> list = session.createQuery("from Student", Student.class).getResultList();
        session.getTransaction().commit();
        return list;
    }

    public void updateStudent(int id, double newMarks) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Student s = session.get(Student.class, id);
        if (s != null) {
            s.setMarks(newMarks);
        }
        session.getTransaction().commit();
    }

    public void deleteStudent(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Student s = session.get(Student.class, id);
        if (s != null) {
            session.delete(s);
        }
        session.getTransaction().commit();
    }
}
