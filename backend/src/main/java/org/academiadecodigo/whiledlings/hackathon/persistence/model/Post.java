package org.academiadecodigo.whiledlings.hackathon.persistence.model;


import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Model for simple Post
 */

@Entity
@Table(name = "post")
public class Post {

    private String title;
    private String message;


    /**
     * GETTERS AND SETTERS FOR ALL @PARAM
     */


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
