
package com.cognizant.repository;

import java.util.List;

import com.cognizant.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // -----------------------------
    // HQL Query
    // -----------------------------

    @Query("FROM Employee")
    List<Employee> getAllEmployeesHQL();

    // -----------------------------
    // HQL Query using WHERE
    // -----------------------------

    @Query("FROM Employee e WHERE e.department.name=?1")
    List<Employee> findEmployeeByDepartment(String department);

    // -----------------------------
    // Native SQL Query
    // -----------------------------

    @Query(value = "SELECT * FROM employee", nativeQuery = true)
    List<Employee> getAllEmployeesNative();

    // -----------------------------
    // Native SQL Query with WHERE
    // -----------------------------

    @Query(value = "SELECT * FROM employee WHERE name=?1", nativeQuery = true)
    List<Employee> findEmployeeNative(String name);

}