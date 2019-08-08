package org.academiadecodigo.whiledlings.hackathon.persistence.model;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "crowdpost")
public class CrowdPost extends Post {

    private Integer moneyNeeded;

    private Integer moneyRazed;
}
