package org.academiadecodigo.whiledlings.hackathon.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
        return em.merge(Post);
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
