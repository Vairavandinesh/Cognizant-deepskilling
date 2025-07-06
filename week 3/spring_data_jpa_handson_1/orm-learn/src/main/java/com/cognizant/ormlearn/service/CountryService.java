package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repo;

    public List<Country> getAll() {
        return repo.findAll();
    }

    public Country getByCode(String code) {
        return repo.findById(code).orElse(null);
    }

    public void add(Country country) {
        repo.save(country);
    }

    public void update(String code, Country country) {
        country.setCode(code);
        repo.save(country);
    }

    public void delete(String code) {
        repo.deleteById(code);
    }
}
