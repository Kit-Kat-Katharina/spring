package com.example.spring11ormmappingonetoone2.repository;

import com.example.spring11ormmappingonetoone2.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
