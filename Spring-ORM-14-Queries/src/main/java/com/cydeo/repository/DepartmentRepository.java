package com.cydeo.repository;

import com.cydeo.entities.Department;
import com.cydeo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    //Display all department in the furniture Department
    List<Department> findByDepartment(String department);
    //Display all Departments in the Health Division
    ////Same results for the next two derive queries->
    List<Department> findByDivisionIs(String division);
    //or
    List<Department> findByDivisionEquals(String division);

    //Display top 3 departments with division name 'Hea' , without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String division);

    //JPQL query
    //positional parameters
    @Query("SELECT d FROM Department d WHERE d.division IN ?1")
    List<Department>getDepartmentDivision(List<String> division);
    //defined in jpa-named-queries
    List<Department> retrieveDepartmentByDivision(String division);


    @Query(nativeQuery = true)
    List<Department> retrieveDepartmentByDivisionContain(String pattern); // 'electro' - contains this one
}
