package com.rishabh.EazyBankBackendApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/getCards")
    public String getCardsDetails(){
        return "Hello Rishabh here is your all the card details !!!";
    }
}
