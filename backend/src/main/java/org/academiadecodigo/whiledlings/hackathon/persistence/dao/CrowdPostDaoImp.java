package org.academiadecodigo.whiledlings.hackathon.persistence.dao;

import org.academiadecodigo.whiledlings.hackathon.persistence.model.CrowdPost;
import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional
@Repository
public class CrowdPostDaoImp implements CrowdPostDao {


    @PersistenceContext
    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }
    @Override
    public void delete(Integer id) {
        em.remove(em.find(CrowdPost.class, id));
    }

    @Override
    public CrowdPost saveOrUpdate(CrowdPost crowdPost) {
        return em.merge(crowdPost);
    }

    @Override
    public CrowdPost findById(Integer id) {

        return em.find(CrowdPost.class, id);
    }

    @Override
    public List<CrowdPost> listAll() {
            return em.createQuery( "FROM CrowdPost", CrowdPost.class).getResultList();
        }
}
