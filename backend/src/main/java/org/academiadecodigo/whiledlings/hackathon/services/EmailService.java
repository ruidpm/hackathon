package org.academiadecodigo.whiledlings.hackathon.services;

public interface EmailService {

    public void sendSimpleMessage(String to, String subject, String text);
}
