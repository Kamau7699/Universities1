package com.bbit.repositories;

import com.bbit.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {
    //Select * from courses where university_id = {###}
    List<Course> findByUniversityId(Long id);
}
