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
    public static void main(String[] args) throws SQLException, IOException {


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



        System.out.println("App is running. Press Enter to exit...");
        System.in.read(); // Keeps the app alive until you press Enter

//16:22:33.550 [main] INFO org.hibernate.orm.connections.pooling --
// HHH10001008: Cleaning up connection pool [jdbc:h2:mem:studentdb]
       /* you're using an in-memory H2 database (mem:studentdb).
        When your main() method completes, Hibernate shuts down, and the database is destroyed.
        So when you try to access the H2 console after that, it can't find the database — hence the error.
*/

        session.close();
        factory.close();
    }
}

