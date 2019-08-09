package org.academiadecodigo.whiledlings.hackathon.services;

import org.academiadecodigo.whiledlings.hackathon.persistence.dao.PostDao;
import org.academiadecodigo.whiledlings.hackathon.persistence.dao.UserDao;
import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;
import org.academiadecodigo.whiledlings.hackathon.persistence.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserModel getUser(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.delete(id);
    }

    @Override
    public UserModel saveUser(UserModel userModel) {
        return userDao.saveOrUpdate(userModel);
    }

    @Override
    public List<UserModel> getAllUsers() {
        return userDao.listAll();
    }
}
