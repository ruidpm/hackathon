package org.academiadecodigo.whiledlings.hackathon;

import org.academiadecodigo.whiledlings.hackathon.persistence.dao.PostDaoImpl;
import org.academiadecodigo.whiledlings.hackathon.services.EmailServiceImpl;

public class Stufftodo {


    //// TODO: 07/08/2019 name and app path in pom.xml 
    // TODO: 07/08/2019 change names and user and pass in properties 
    // TODO: 07/08/2019 change packages to scan in mysql.xml 
    //// TODO: 07/08/2019 packages to scan in spring-config.xml 
    //// TODO: 07/08/2019 check if it works without json way import
    //// TODO: 07/08/2019 uncomment transaction factory in spring-config.xml

    public static void main(String[] args) {

        EmailServiceImpl mail = new EmailServiceImpl();
        mail.setJavaMailSender(mail.getJavaMailSender());
        mail.sendSimpleMessage("ruidpm2@gmail.com", "teste", "test");
    }
}
