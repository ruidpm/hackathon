package org.academiadecodigo.whiledlings.hackathon.services;

import org.academiadecodigo.whiledlings.hackathon.persistence.dao.CrowdPostDao;
import org.academiadecodigo.whiledlings.hackathon.persistence.model.CrowdPost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrowdPostServiceImp implements CrowdPostService{

    private CrowdPostDao crowdPostDao;

    @Autowired
    public void setPostDao(CrowdPostDao crowdPostDao) {
        this.crowdPostDao = crowdPostDao;
    }

    @Override
    public CrowdPost getPost(Integer id) {
        return crowdPostDao.findById(id);
    }

    @Override
    public void deletePost(Integer id) {
        crowdPostDao.delete(id);
    }

    @Override
    public CrowdPost savePost(CrowdPost crowdPost) {
        return crowdPostDao.saveOrUpdate(crowdPost);
    }

    @Override
    public List<CrowdPost> getAllPosts() {
        return crowdPostDao.listAll();
    }
}
