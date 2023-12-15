package com.cydeo.repository;

import com.cydeo.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course, Long> {
    //DERIVE QUERIES - use for simple queries
    //Find all courses by category
    List<Course> findByCategory(String category);

    //Find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //Checks if a course with provided name exists - true if exists , false - if doesn't
    boolean existsByName(String name);

    //returns the count of courses for the provided category
    int countByCategory(String category);

    //find all courses that start with the provided courseName
    List<Course> findByNameStartingWith(String name);

    //Find all courses by category and returns stream
    Stream<Course> streamByCategory(String category);
    //"?" -> for positional, and ":" -> for name params

    //name parameters

    @Query("SELECT c FROM Course c WHERE c.category=:category AND c.rating>:rating")
    List<Course> findAllByCategoryAndRatingGreaterThan(@Param("category")String category,@Param("rating") int rating);




}
