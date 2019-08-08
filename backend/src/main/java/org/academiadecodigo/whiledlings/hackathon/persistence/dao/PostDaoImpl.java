package org.academiadecodigo.whiledlings.hackathon.persistence.dao;

import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class PostDaoImpl implements PostDao{

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
    public Post saveOrUpdate(Post post) {
        return em.merge(post);
    }

    @Override
    public Post findById(Integer id) {
        return em.find(Post.class, id);
    }

    @Override
    public List<Post> listAll() {
        return em.createQuery( "FROM Post", Post.class).getResultList();
    }
}
