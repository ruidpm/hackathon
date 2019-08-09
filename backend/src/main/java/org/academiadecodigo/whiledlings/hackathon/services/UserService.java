package org.academiadecodigo.whiledlings.hackathon.services;

import org.academiadecodigo.whiledlings.hackathon.persistence.model.UserModel;

import java.util.List;

public interface UserService {

    UserModel getUser(Integer id);

    void deleteUser(Integer id);

    UserModel saveUser(UserModel userModel);

    List<UserModel> getAllUsers();
}
