package org.academiadecodigo.whiledlings.hackathon.services;

import org.academiadecodigo.whiledlings.hackathon.persistence.model.CrowdPost;

import java.util.List;

public interface CrowdPostService {

    CrowdPost getPost(Integer id);

    void deletePost(Integer id);

    CrowdPost savePost(CrowdPost crowPost);

    List<CrowdPost> getAllPosts();
}
