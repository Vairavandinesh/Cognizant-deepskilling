package com.example.loan_service.controller;

import com.example.loan_service.model.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @GetMapping("/info")
    public Loan getLoanInfo() {
        return new Loan("LN100", 50000.0, 7.5);
    }
}

