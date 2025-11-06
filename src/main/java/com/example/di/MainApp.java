package com.example.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Initialize Spring context from AppConfig class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve bean and call method
        Student student = context.getBean(Student.class);
        student.displayInfo();

        // Close context
        context.close();
    }
}
