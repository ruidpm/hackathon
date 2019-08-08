package org.academiadecodigo.whiledlings.hackathon.persistence.dao;

import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PostDaoImpl implements PostDao{

    private EntityManager em;

    @PersistenceContext
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
        return null;
    }
}
