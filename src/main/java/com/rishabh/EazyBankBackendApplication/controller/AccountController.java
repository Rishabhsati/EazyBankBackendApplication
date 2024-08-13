package com.rishabh.EazyBankBackendApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/getAccount")
    public String getAccountDetails(){
        return "Hello Rishabh here are your account details!!!";
    }
}
