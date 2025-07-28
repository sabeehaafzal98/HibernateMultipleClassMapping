package com.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.h2.tools.Server;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashSet;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) throws SQLException {


        Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8081").start();

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        University uni = new University();
        uni.setName("Mumbai University");

        Branch branch = new Branch();
        branch.setName("Computer Science");

        Course course1 = new Course();
        course1.setTitle("Mathematics");

        Course course2 = new Course();
        course2.setTitle("Physics");

        Student student = new Student();
        student.setName("Sabeeha");
        student.setEmail("sabeeha@example.com");
        student.setUniversity(uni);
        student.setBranch(branch);
        student.setCourses(new HashSet<>(Arrays.asList(course1, course2)));

        session.beginTransaction();
        session.save(uni);
        session.save(branch);
        session.save(course1);
        session.save(course2);
        session.save(student);
        session.getTransaction().commit();

        session.close();
        factory.close();
    }
}

