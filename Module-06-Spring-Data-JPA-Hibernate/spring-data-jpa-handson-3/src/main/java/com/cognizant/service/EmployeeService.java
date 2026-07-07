
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

    public List<Employee> getAllEmployeesHQL() {
        return repository.getAllEmployeesHQL();
    }

    public List<Employee> getEmployeeDepartment(String department) {
        return repository.findEmployeeByDepartment(department);
    }

    public List<Employee> getAllEmployeesNative() {
        return repository.getAllEmployeesNative();
    }

    public List<Employee> getEmployeeNative(String name) {
        return repository.findEmployeeNative(name);
    }

}