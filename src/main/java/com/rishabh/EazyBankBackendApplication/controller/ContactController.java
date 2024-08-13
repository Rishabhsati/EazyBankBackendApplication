package com.rishabh.EazyBankBackendApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contact")
    public String saveContactInquiryDetails(){
        return "Hey Rishabh we have saved your Inquiry details !!!";
    }
}
