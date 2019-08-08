package org.academiadecodigo.whiledlings.hackathon.persistence.dao;



public interface UserDao {
    void delete (Integer id);

    UserModel saveOrUpdate (UserModel userModel);

    UserModel findById (Integer id);

    List<UserModel> listAll();
}
