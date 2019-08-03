package com.bbit.controller;

import com.bbit.NotFoundException;
import com.bbit.models.Course;
import com.bbit.models.University;
import com.bbit.repositories.CourseRepository;
import com.bbit.repositories.UniversityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//localhost:8080/universities
@RestController
@RequestMapping(value = "universities")
public class UniversityController {

    private final UniversityRepository universityRepository;
    private final CourseRepository courseRepository;

    public UniversityController(UniversityRepository universityRepository, CourseRepository courseRepository) {
        this.universityRepository = universityRepository;
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    @PostMapping
    public University createUniversity(@RequestBody University university) {
        return universityRepository.save(university);
    }

    @DeleteMapping(value = "{id}")
    public void deleteUniversity(@PathVariable Long id) {
        //Method 1
        // universityRepository.deleteById(id);

        //Method 2
        University university = findOneById(id);
        universityRepository.delete(university);
    }

    @PatchMapping(value = "{id}")
    public University updateUniversity(@PathVariable Long id,
                                       @RequestBody University university) {
        University foundUniversity = findOneById(id);

        foundUniversity.setUniversityName(university.getUniversityName());
        foundUniversity.setLatitude(university.getLatitude());
        foundUniversity.setLocation(university.getLocation());
        foundUniversity.setLongitude(university.getLongitude());

        return universityRepository.save(foundUniversity);
    }

    //localhost:8080/universities/1
    @GetMapping(value = "{id}")
    public University findOneById(@PathVariable Long id) {
        University university
                = universityRepository.findById(id).orElseThrow(() ->
                new NotFoundException("No university with the id " + id + " was found."));
        return university;
    }

    @GetMapping(value = "{universityId}/courses")
    public List<Course> findByUniversityId(@PathVariable Long universityId) {
        return courseRepository.findByUniversityId(universityId);
    }

    @PostMapping(value = "{universityId}/courses")
    public Course createCourse(@PathVariable Long universityId,
                                     @RequestBody Course course) {
        University university = findOneById(universityId);
        course.setUniversity(university);
        System.err.println(course.toString());
        return courseRepository.save(course);
    }

    @GetMapping(value = "search")
    public List<University> search(@RequestParam String name,
                                   @RequestParam(required = false) String location) {
        if (location != null)
            return universityRepository.findByUniversityNameStartingWithAndLocation(
                    name, location);
        else
            return universityRepository.findByUniversityNameStartingWith(name);
    }
}
