package com.bbit.controller;

import com.bbit.BadRequestException;
import com.bbit.NotFoundException;
import com.bbit.models.Course;
import com.bbit.repositories.CourseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "courses")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping("{id}/add/{someValue}")
    private Course add(@PathVariable Long id,
                       @PathVariable int someValue){
        Course course = courseRepository.findById(id)
                .orElseThrow(()->
                        new NotFoundException("Course not found"));
        int newEnrollmentCount = course.getMaximumEnrollment() + someValue;

        if(newEnrollmentCount>7){
            throw new BadRequestException("Cannot enroll new students");
        }

        course.setMaximumEnrollment(newEnrollmentCount);
        courseRepository.save(course);
        return course;
    }


}
