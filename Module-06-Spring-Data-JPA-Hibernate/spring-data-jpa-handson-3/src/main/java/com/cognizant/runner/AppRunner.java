
package com.cognizant.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.service.EmployeeService;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    EmployeeService service;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("==============");
        System.out.println("HQL Query");
        System.out.println("==============");

        service.getAllEmployeesHQL()
                .forEach(System.out::println);

        System.out.println();

        System.out.println("==============");
        System.out.println("HQL WHERE");
        System.out.println("==============");

        service.getEmployeeDepartment("IT")
                .forEach(System.out::println);

        System.out.println();

        System.out.println("==============");
        System.out.println("Native Query");
        System.out.println("==============");

        service.getAllEmployeesNative()
                .forEach(System.out::println);

        System.out.println();

        System.out.println("==============");
        System.out.println("Native WHERE");
        System.out.println("==============");

        service.getEmployeeNative("Rahul")
                .forEach(System.out::println);

    }

}