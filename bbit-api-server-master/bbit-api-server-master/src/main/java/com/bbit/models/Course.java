package com.bbit.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_description")
    private String courseDescription;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "university_id")
    private University university;

    @Column(name = "maximum_enrollment" )
    private int maximumEnrollment = 1;

    @ManyToMany(mappedBy = "courses")
    private Set<Human> students = new HashSet<>();

    public Course(String courseName, University university) {
        this.courseName = courseName;
        this.university = university;
    }

    private Course() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public int getMaximumEnrollment() {
        return maximumEnrollment;
    }

    public void setMaximumEnrollment(int maximumEnrollment) {
        this.maximumEnrollment = maximumEnrollment;
    }

    public Set<Human> getStudents() {
        return students;
    }

    public void setStudents(Set<Human> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", university=" + university +
                ", maximumEnrollment=" + maximumEnrollment +
                ", students=" + students +
                '}';
    }
}
