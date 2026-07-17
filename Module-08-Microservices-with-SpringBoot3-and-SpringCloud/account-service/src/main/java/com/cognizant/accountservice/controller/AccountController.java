package com.cognizant.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.accountservice.model.Account;
import com.cognizant.accountservice.service.AccountService;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/account")
    public Account getAccount() {

        return accountService.getAccount();

    }

}