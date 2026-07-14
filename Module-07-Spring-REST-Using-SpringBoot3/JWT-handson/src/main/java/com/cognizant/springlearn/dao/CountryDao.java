package com.cognizant.springlearn.dao;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Country;

@Repository
public class CountryDao {

    private List<Country> countryList;

    @SuppressWarnings("deprecation")
    public CountryDao() {

        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("country.xml"));

        countryList = (List<Country>) factory.getBean("countryList");
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