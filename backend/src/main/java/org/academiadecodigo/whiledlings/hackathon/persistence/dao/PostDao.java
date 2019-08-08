package org.academiadecodigo.whiledlings.hackathon.persistence.dao;

import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;

import java.util.List;

public interface PostDao {

    void delete (Integer id);

    Post saveOrUpdate (Post post);

    Post findById (Integer id);

    List<Post> listAll();
}
