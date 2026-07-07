
package com.cognizant.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.model.Country;
import com.cognizant.service.CountryService;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(" All Countries ");

        countryService.getAllCountries()
                .forEach(country -> System.out.println(country.getCode() + " - " + country.getName()));

        System.out.println("\n Find Country");

        Country country = countryService.getCountry("IN");

        if (country != null) {
            System.out.println(country.getCode() + " - " + country.getName());
        }

        System.out.println("\n========== Add Country ==========");

        Country france = new Country("FR", "France");

        countryService.addCountry(france);

        countryService.getAllCountries().forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));
    }
}