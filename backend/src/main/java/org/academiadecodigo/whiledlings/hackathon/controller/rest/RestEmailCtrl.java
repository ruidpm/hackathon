package org.academiadecodigo.whiledlings.hackathon.controller.rest;

import org.academiadecodigo.whiledlings.hackathon.pojo.EmailPojo;
import org.academiadecodigo.whiledlings.hackathon.services.EmailService;
import org.academiadecodigo.whiledlings.hackathon.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/sendmail")
public class RestEmailCtrl {

    private EmailService emailService;
    private PostService postService;

    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @Autowired
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<?> sendMail(@RequestBody EmailPojo emailPojo) {

        emailService.sendSimpleMessage(postService.getPost(emailPojo.getId()).getEmail()
                ,emailPojo.getSubject(),emailPojo.getMessage());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
