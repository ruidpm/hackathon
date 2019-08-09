package org.academiadecodigo.whiledlings.hackathon.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "crowdpost")
public class CrowdPost extends AbstractModel {

    private String message;
    private String title;
    private String email;
    private String url;
    private Integer moneyNeeded;
    private Integer moneyDonated;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Integer getMoneyNeeded() {
        return moneyNeeded;
    }

    public void setMoneyNeeded(Integer moneyNeeded) {
        this.moneyNeeded = moneyNeeded;
    }

    public Integer getMoneyDonated() {
        return moneyDonated;
    }

    public void setMoneyDonated(Integer moneyDonated) {
        this.moneyDonated = moneyDonated;
    }
}


