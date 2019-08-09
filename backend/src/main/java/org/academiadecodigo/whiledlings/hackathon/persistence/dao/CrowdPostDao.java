package org.academiadecodigo.whiledlings.hackathon.persistence.dao;

import org.academiadecodigo.whiledlings.hackathon.persistence.model.CrowdPost;
import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;

import java.util.List;

public interface CrowdPostDao {

    void delete (Integer id);

    CrowdPost saveOrUpdate (CrowdPost crowdPost);

    CrowdPost findById (Integer id);

    List<CrowdPost> listAll();
}

