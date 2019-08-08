package org.academiadecodigo.whiledlings.hackathon.controller.rest;

import org.academiadecodigo.whiledlings.hackathon.pojo.EmailPojo;
import org.academiadecodigo.whiledlings.hackathon.services.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sendmail")
public class RestEmailCtrl {

    private EmailServiceImpl emailService;

    @Autowired
    public void setEmailService(EmailServiceImpl emailService) {
        this.emailService = emailService;
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<?> sendMail(@RequestBody EmailPojo emailPojo) {

        emailService.sendSimpleMessage(emailPojo.getDestinatary(),emailPojo.getSubject(),emailPojo.getMessage());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
