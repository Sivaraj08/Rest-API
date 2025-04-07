package com.example.ProjectFinal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjectFinal.Service.EmailService;

@RestController
public class EmailController {
    @Autowired
    private EmailService eS;
    @PostMapping("/email")
    public String postEmail(@RequestParam String receiver, @RequestParam String subject, @RequestParam String body) {
        return eS.sendMail(receiver, subject, body);
    }
}	 