package org.academiadecodigo.whiledlings.hackathon.persistence.model;


import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Model for simple Post
 */

@Entity
@Table(name = "post")
public class Post extends AbstractModel {

    private String message;
    private String title;
    private String email;
    private String url;


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


}
