package com.bbit.repositories;

import com.bbit.models.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UniversityRepository extends JpaRepository<University, Long> {

    List<University> findByUniversityNameStartingWith(String name);

    List<University> findByUniversityNameStartingWithAndLocation(
            String name,
            String location);

    List<University> findByCapacityBetween(int from, int to);

    List<University> findByCapacityLessThan(int value);

    List<University> findByCapacityIsNot(int value);

    List<University> findByLatitudeIsNotAndLongitudeIsNot(double lat,
                                                          double longitude);

}
