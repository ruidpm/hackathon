package org.academiadecodigo.whiledlings.hackathon.controller.command;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CrowdPostDto {

    private Integer id;
    private String title;
    private String message;
    private String email;
    private String url;
    private Integer moneyNeeded;
    private Integer moneyDonated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
