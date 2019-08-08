package org.academiadecodigo.whiledlings.hackathon.persistence.dao;

import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public void delete(Integer id) {
        em.remove(em.find(Post.class, id));
    }

    @Override
    public UserModel saveOrUpdate(UserModel userModel {
        return em.merge(UserModel);
    }

    @Override
    public UserModel findById(Integer id) {

        return em.find(UserModel.class, id);
    }

    @Override
    public List<UserModel> listAll() {
        return em.createQuery( "FROM UserModel", UserModel.class).getResultList();
    }
}
