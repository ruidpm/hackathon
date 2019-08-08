package org.academiadecodigo.whiledlings.hackathon.services;

public interface PostService {

    Post getPost(Integer id);

    void deletePost(Integer id);

    Post savePost(Post post);
}
