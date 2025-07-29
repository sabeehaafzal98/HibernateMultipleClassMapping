# HibernateMultipleClassMapping
Mapping Student to University and Branch and courses

.
Student (linked to University, Branch, and Course)
University (One-to-Many with Students)
Branch (One-to-Many with Students)
Course (Many-to-Many with Students)


🧱 Entity Relationships Summary
Entity	Relationship Type	Related Entity
Student	Many-to-One	University
Student	Many-to-One	Branch
Student	Many-to-Many	Course
University	One-to-Many	Student
Branch	One-to-Many	Student
Course	Many-to-Many	Student



Before JPA (Pre-2006)
Hibernate was a standalone ORM framework developed in the early 2000s.
It used XML-based configuration (.hbm.xml) for mapping Java classes to database tables.
Hibernate became very popular due to its flexibility and powerful features.

