package com.cognizant.accountservice.service;

import org.springframework.stereotype.Service;

import com.cognizant.accountservice.model.Account;

@Service
public class AccountService {

    public Account getAccount() {

        return new Account(
                1001,
                "Prithvi Raj",
                50000.00);

    }

}