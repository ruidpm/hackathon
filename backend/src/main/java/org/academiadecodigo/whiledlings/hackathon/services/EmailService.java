package org.academiadecodigo.whiledlings.hackathon.services;

import org.academiadecodigo.whiledlings.hackathon.pojo.EmailPojo;
import org.springframework.mail.javamail.JavaMailSender;

public interface EmailService {

    public void sendMessage(EmailPojo emailPojo);
}
