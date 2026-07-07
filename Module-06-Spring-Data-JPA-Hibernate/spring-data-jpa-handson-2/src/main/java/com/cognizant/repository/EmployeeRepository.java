
package com.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Query Method
    List<Employee> findByName(String name);

    // Query Method
    List<Employee> findByDepartmentName(String name);

}