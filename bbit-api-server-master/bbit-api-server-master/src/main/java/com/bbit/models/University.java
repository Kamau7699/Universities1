package com.bbit.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "universities")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "university_name")
    private String universityName;

    @Column(name = "location")
    private String location;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "capacity")
    private Integer capacity;

    @OneToMany(mappedBy = "university")
    private List<Course> courses;

    @OneToOne
    @JoinColumn(name = "chancellor_id")
    private Human chancellor;

    public University(String universityName, double latitude, double longitude) {
        this.universityName = universityName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public University(String universityName, String location,  int capacity) {
        this.universityName = universityName;
        this.location = location;
        this.capacity = capacity;
    }

    private University() {}

    public Human getChancellor() {
        return chancellor;
    }

    public void setChancellor(Human chancellor) {
        this.chancellor = chancellor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
