package com.rsr.email_microservice.port.admin.controller;


import com.rsr.email_microservice.core.domain.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/sendEmail")
    public String sendEmail() {
        emailService.sendEmail("grischa.storch@gmail.com", "Hallöchen", "Ist nur n Test");
        return "Sent succesfully";
    }
}
