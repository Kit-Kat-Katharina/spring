package com.cydeo.repository;

import com.cydeo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //Display all employees with email address ' '
    List<Employee> findByEmail(String email);

    //Display all employees with first name ' ' and last name and show all employees with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //Display all employees that first name is not ''
    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all employees where last name starts with ''
    List<Employee> findByLastNameStartsWith(String pattern);

    //Display all employees with salaries higher than ''
    List<Employee> findBySalaryGreaterThan(Integer salary);
    //Display all employees with salary less tha ''

    List<Employee> findBySalaryLessThanEqual(Integer salary);

    //Display all employees that has been hired between '' and ''
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //Display all employees where salaries greater and equal to '' in order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //Display top unique employee that is making less than ''
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();

    //THAT's not a derive query it is JPQL
    //Employee e =>new Employee ();
    @Query("SELECT e FROM Employee e WHERE e.email = 'myakovlivf@ucsd.edu'")
    Employee getEmployeeDetail();

    @Query("SELECT e.salary FROM Employee e WHERE e.email='myakovlivf@ucsd.edu'")
    Integer getEmployeeSalary();

    @Query("SELECT e FROM Employee e WHERE e.email=?1")
    Optional<Employee> getEmployeeDetail(String email); //optional we add in case if any employee doesn't have this email address, it will return null pointer exception

    @Query("SELECT e FROM Employee  e WHERE e.email=?1 AND e.salary=?2")
    Employee employeeDetail(String email, int salary);

    //@Query -2 options = JPQL and NATIVE SQL QUERY
    //Native SQL Query - directly goes to DATABASE and DOING the action
    //JPQL - will do actions on ENTITIES(objects)

    //Not Equal
    //JPQL query - for it we put after FROM - Not TABLE! name from the database, we put CLASS! name ("Employee" e)(we are creating an instance)
    @Query("SELECT e FROM Employee e WHERE e.salary<> ?1 ")
    List<Employee>getEmployeeSalaryNotEqual(int salary);

    //like/contains/startsWith/endsWith
    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1")
    List<Employee>getEmployeeFirstNameLike(String pattern);

    //less than
    @Query("SELECT e FROM Employee e WHERE e.salary < ?1")
    List<Employee> getEmployeeSalaryLessThan(int salary);
    //greaterThan
    @Query("SELECT e FROM Employee e WHERE e.salary > ?1")
    List<Employee> getEmployeeSalaryGreaterThan(int salary);

    //Before
    @Query("SELECT e FROM Employee e WHERE e.hireDate > ?1")
    List<Employee>getEmployeeHireDateBefore(LocalDate date);

    //Between
    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee>getEmployeeSalaryBetween(int salary1, int salary2);
    //NOT null
    @Query("SELECT e FROM Employee e WHERE e.email IS NOT NULL")
    List<Employee>getEmployeeEmailISNull();

    //Sorting in Ascending Order
    @Query("SELECT e FROM Employee e ORDER BY e.salary")
    List<Employee>getEmployeeSalaryOrderAsc();

    //Sorting in Descending Order
    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC ")
    List<Employee>getEmployeeSalaryOrderDesc();

    //NATIVE SQL QUERY - directly goes to database
    @Query(value = "SELECT * FROM employee WHERE salary ?1", nativeQuery = true)
    List<Employee>readEmployeeDetailBySalary(int salary);



}
