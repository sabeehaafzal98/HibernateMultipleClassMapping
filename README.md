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



Course --Many-to-Many-- Student ---Many-to-one-- University
                          |||
                        Many-to-One
                          |||
                         Branch
