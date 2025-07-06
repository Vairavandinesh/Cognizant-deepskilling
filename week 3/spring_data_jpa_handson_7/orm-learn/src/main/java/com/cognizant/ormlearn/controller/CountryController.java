package com.cognizant.ormlearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/{code}")
    public Country getByCode(@PathVariable String code) {
        return service.getByCode(code);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return service.addCountry(country);
    }

    @GetMapping
    public List<Country> getAll() {
        return service.getAllCountries();
    }

    @GetMapping("/search")
    public List<Country> searchByName(@RequestParam String name) {
        return service.searchByName(name);
    }
}