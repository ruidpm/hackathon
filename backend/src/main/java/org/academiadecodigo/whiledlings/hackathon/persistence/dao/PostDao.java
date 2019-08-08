package org.academiadecodigo.whiledlings.hackathon.persistence.dao;

public interface PostDao {

    void delete (Integer id);

    Post saveOrUpdate (Post post);

    Post findById (Integer id);

    List<Post> listAll();
}
