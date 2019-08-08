package org.academiadecodigo.whiledlings.hackathon.persistence.model;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Model for simple Post
 */

@Entity
@Table(name = "post")
public class Post extends AbstractModel{

    @ManyToOne
    private UserModel userModel;

    private String title;
    private String message;

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
}
