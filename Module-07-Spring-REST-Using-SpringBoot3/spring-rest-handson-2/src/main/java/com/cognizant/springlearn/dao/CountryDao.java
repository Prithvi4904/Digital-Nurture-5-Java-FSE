package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Country;

@Repository
public class CountryDao {

    private static List<Country> countryList;

    static {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        countryList = (ArrayList<Country>) context.getBean("countryList");
    }

    public List<Country> getAllCountries() {
        return countryList;
    }

    public Country getCountry(String code) {

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }

        }

        return null;
    }

}