package org.academiadecodigo.whiledlings.hackathon.persistence.model;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "crowdpost")
public class CrowdPost extends AbstractPost {

    @ManyToOne
    private UserModel userModel;

    private String title;
    private String message;
    private Integer moneyNeeded;
    private Integer moneyRazed;


    /**
     *
     * GETTERS AND SETTERS FOR ALL @PARAM
     *
     */

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getMoneyNeeded() {
        return moneyNeeded;
    }

    public void setMoneyNeeded(Integer moneyNeeded) {
        this.moneyNeeded = moneyNeeded;
    }

    public Integer getMoneyRazed() {
        return moneyRazed;
    }

    public void setMoneyRazed(Integer moneyRazed) {
        this.moneyRazed = moneyRazed;
    }
}
