package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Department;
import com.cognizant.springlearn.model.Employee;
import com.cognizant.springlearn.model.Skill;

@Repository
public class EmployeeDao {

    private static List<Employee> employees = new ArrayList<>();

    static {

        Department d1 = new Department(1, "IT");

        Skill s1 = new Skill(1, "Java");
        Skill s2 = new Skill(2, "Spring Boot");

        employees.add(

                new Employee(

                        101,
                        "Rahul",
                        75000,
                        d1,
                        Arrays.asList(s1, s2)

                )

        );

    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) {

        for (Employee employee : employees) {

            if (employee.getId() == id) {
                return employee;
            }

        }

        return null;

    }

}