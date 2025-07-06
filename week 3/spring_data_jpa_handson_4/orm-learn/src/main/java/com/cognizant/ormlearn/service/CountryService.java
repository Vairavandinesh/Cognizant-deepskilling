package com.cognizant.ormlearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repo;

    public Country getByCode(String code) {
        return repo.findById(code).orElse(null);
    }

    public Country addCountry(Country country) {
        return repo.save(country);
    }

    public List<Country> getAllCountries() {
        return repo.findAll();
    }
}