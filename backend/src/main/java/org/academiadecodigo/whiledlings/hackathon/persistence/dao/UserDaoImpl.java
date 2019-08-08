package org.academiadecodigo.whiledlings.hackathon.persistence.dao;

import org.academiadecodigo.whiledlings.hackathon.persistence.model.UserModel;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends GenericDao<UserModel> implements UserDao {

    public UserDaoImpl() {
        super(UserModel.class);
    }
}
