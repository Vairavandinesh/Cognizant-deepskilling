package com.example.account_service.controller;

import com.example.account_service.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/info")
    public Account getAccountInfo() {
        return new Account("ACC123", "Arun R", 10000.0);
    }
}

