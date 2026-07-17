package com.cognizant.loanservice.service;

import org.springframework.stereotype.Service;

import com.cognizant.loanservice.model.Loan;

@Service
public class LoanService {

    public Loan getLoan() {

        return new Loan(

                501,

                "Home Loan",

                2500000.00

        );

    }

}