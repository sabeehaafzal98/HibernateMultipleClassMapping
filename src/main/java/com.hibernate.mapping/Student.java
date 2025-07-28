package com.hibernate.mapping;

import java.util.Set;

public class Student {


    private int id;
    private String name;
    private String email;
    private University university;
    private Branch branch;
    private Set<Course> courses;

    public Student() {
    }

    public Student(int id, String name, String email, University university, Branch branch, Set<Course> courses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.university = university;
        this.branch = branch;
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    // Getters and setters
}
