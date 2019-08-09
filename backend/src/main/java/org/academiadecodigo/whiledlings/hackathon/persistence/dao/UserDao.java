package org.academiadecodigo.whiledlings.hackathon.persistence.dao;


import org.academiadecodigo.whiledlings.hackathon.persistence.model.UserModel;

import java.util.List;

public interface UserDao {
    void delete (Integer id);

    UserModel saveOrUpdate (UserModel userModel);

    UserModel findById (Integer id);

    List<UserModel> listAll();
}
