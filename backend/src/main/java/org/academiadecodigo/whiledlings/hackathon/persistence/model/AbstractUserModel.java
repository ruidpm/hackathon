package org.academiadecodigo.whiledlings.hackathon.persistence.model;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Mapped Super Class for any model for persistence
 */

@MappedSuperclass
public abstract class AbstractUserModel implements Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Version
    public Integer version;

    @CreationTimestamp
    public Date creationDate;

    @UpdateTimestamp
    public Date updateDate;

    @Override
    public Integer getId(){
        return id;
    }

    @Override
    public void setId(Integer id){
        this.id=id;
    }



}
