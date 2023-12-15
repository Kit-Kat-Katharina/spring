package com.cydeo.repository;

import com.cydeo.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {
    //DERIVE QUERIES - use for simple queries
    //Find all courses by category
    List<Course> findByCategory(String category);
    //Find all courses by category and order the entities by name
    List<Course>findByCategoryOrderByName(String category);
    //Checks if a course with provided name exists - true if exists , false - if doesn't
    boolean existsByName(String name);
    //returns the count of courses for the provided category
    int countByCategory(String category);
    //find al lcourses that start with the provided courseName
    List<Course>findByNameStartingWith(String name);
    //Find all courses by category and returns stream
    Stream<Course>streamByCategory(String category);
}
