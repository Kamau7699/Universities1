package com.bbit;

import com.bbit.models.*;
import com.bbit.repositories.CourseRepository;
import com.bbit.repositories.HumanRepository;
import com.bbit.repositories.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class DummyData implements CommandLineRunner {

    public DummyData(UniversityRepository universityController, CourseRepository courseRepository, HumanRepository humanRepository) {
        this.universityRepository = universityController;
        this.courseRepository = courseRepository;
        this.humanRepository = humanRepository;
    }

    private final UniversityRepository universityRepository;
    private final CourseRepository courseRepository;
    private final HumanRepository humanRepository;

    @Override
    public void run(String... args) throws Exception {
        University jkuat =new University("JKUAT",
                "Juja",1000);

        Human chancellor = humanRepository.save(new Human("Omollo Owour"));
        jkuat.setChancellor(chancellor);


        University strathmore =  new University("Strathmore",
                "Ole Sangale",3000);
        universityRepository.saveAll(Arrays.asList(strathmore, jkuat));

        University uon = new University("UON", "CBD",200);
        universityRepository.save(uon);

        Course course1 = new Course("API", strathmore);
        courseRepository.save(course1);

        Course course2 = new Course("Automata", strathmore);
        courseRepository.save(course2);

        Human student = humanRepository.save(new Human("Gavin"));
        student.addCourse(course1);
        student.addCourse(course2);
        humanRepository.save(student);

        Human student2 = humanRepository.save(new Human("Wabwire"));
        student2.addCourse(course1);
        humanRepository.save(student2);

       // Human student


//        RestTemplate restTemplate = new RestTemplate();
//        String testUrl = "https://www.fuzu.com/api/all_jobs_ordered";

//        ResponseEntity<List<Job>> response = restTemplate.exchange(
//                "https://www.fuzu.com/api/all_jobs_ordered",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<Job>>(){});
//        List<Job> employees = response.getBody();
//        System.out.println("Found: "+employees.size());
    }
}
