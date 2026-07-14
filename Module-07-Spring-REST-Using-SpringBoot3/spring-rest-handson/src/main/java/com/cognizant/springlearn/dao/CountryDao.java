package com.cognizant.springlearn.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Country;

@Repository
public class CountryDao {

    @Autowired
    private ApplicationContext context;

    public Country getCountry() {

        Country country = context.getBean("country", Country.class);

        return country;
    }
}