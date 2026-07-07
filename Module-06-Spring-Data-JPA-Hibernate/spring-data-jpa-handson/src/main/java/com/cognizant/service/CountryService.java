
package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Country;
import com.cognizant.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Get all countries
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // Find country by code
    public Country getCountry(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    // Add new country
    public void addCountry(Country country) {
        countryRepository.save(country);
    }
}