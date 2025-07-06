package com.cognizant.ormlearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/{code}")
    public Country getByCode(@PathVariable String code) {
        return service.getByCode(code);
    }
}