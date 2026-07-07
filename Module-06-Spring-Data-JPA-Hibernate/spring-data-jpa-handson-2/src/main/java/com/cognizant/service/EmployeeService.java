
package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Employee;
import com.cognizant.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public List<Employee> getEmployeeByName(String name) {
        return repository.findByName(name);
    }

    public List<Employee> getEmployeesByDepartment(String department) {
        return repository.findByDepartmentName(department);
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

}