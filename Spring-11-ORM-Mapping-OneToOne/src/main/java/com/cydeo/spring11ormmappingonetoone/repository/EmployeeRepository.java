package com.cydeo.spring11ormmappingonetoone.repository;

import com.cydeo.spring11ormmappingonetoone.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
