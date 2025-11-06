package com.example.hibernate;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Create
        Student s1 = new Student();
        s1.setName("Raj");
        s1.setCourse("Java");
        s1.setMarks(85);
        dao.addStudent(s1);

        // Read
        dao.getAllStudents().forEach(st ->
                System.out.println(st.getId() + " " + st.getName() + " " + st.getCourse() + " " + st.getMarks())
        );

        // Update
        dao.updateStudent(1, 90);

        // Delete
        dao.deleteStudent(1);
    }
}
