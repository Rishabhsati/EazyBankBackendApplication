package com.rishabh.EazyBankBackendApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/getBalance")
    public String getBalance(){
        return "Hello Rishabh here is your balance!!!";
    }
}
