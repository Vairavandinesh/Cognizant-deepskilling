package com.cognizant.ormlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping
    public List<Country> getAll() {
        return service.getAll();
    }

    @GetMapping("/{code}")
    public Country getByCode(@PathVariable String code) {
        return service.getByCode(code);
    }

    @PostMapping
    public void add(@RequestBody Country country) {
        service.add(country);
    }

    @PutMapping("/{code}")
    public void update(@PathVariable String code, @RequestBody Country country) {
        service.update(code, country);
    }

    @DeleteMapping("/{code}")
    public void delete(@PathVariable String code) {
        service.delete(code);
    }
}
