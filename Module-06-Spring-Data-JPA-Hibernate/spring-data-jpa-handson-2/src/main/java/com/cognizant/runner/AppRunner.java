
package com.cognizant.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.model.Employee;
import com.cognizant.service.EmployeeService;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("\n====== All Employees ======");

        employeeService.getAllEmployees().forEach(emp -> System.out.println(emp.getId() + " " + emp.getName()));

        System.out.println("\n====== Find By Name ======");

        List<Employee> employees = employeeService.getEmployeeByName("Rahul");

        employees.forEach(emp -> System.out.println(emp.getName()));

        System.out.println("\n====== Find By Department ======");

        employeeService.getEmployeesByDepartment("IT")
                .forEach(emp -> System.out.println(emp.getName()));
    }
}