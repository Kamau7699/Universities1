package com.bbit.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String studentName;

  @ManyToMany
   @JoinTable(name = "student_courses",
joinColumns = @JoinColumn(name = "student_id"),
 inverseJoinColumns = @JoinColumn(name = "courseId"))
private Set<Course> courses = new HashSet<>();

    public Student(String studentName) {
        this.studentName = studentName;
    }

    private Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

 public Set<Course> getCourses() {
 return courses;
 }
//
public void setCourses(Set<Course> courses) {
  this.courses = courses;
}
}
