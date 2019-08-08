package org.academiadecodigo.whiledlings.hackathon.persistence.model;


import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Model for simple Post
 */

@Entity
@Table(name = "post")
public class Post extends AbstractModel {

    private String name;

    private String email;

    private String message;

    private String title;

    private String password;

    private Double moneyBanked;

    private String payPallAccount;

    public String getName() {
        return name;
    }

    /**
     * GETTERS AND SETTERS FOR ALL @PARAM
     */

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoneyBanked() {
        return moneyBanked;
    }

    public void setMoneyBanked(Double moneyBanked) {
        this.moneyBanked = moneyBanked;
    }

    public String getPayPallAccount() {
        return payPallAccount;
    }

    public void setPayPallAccount(String payPallAccount) {
        this.payPallAccount = payPallAccount;
    }
}
