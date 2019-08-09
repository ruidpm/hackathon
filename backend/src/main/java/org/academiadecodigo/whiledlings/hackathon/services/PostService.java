package org.academiadecodigo.whiledlings.hackathon.services;

import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;

import java.util.List;

public interface PostService {

    Post getPost(Integer id);

    void deletePost(Integer id);

    Post savePost(Post post);

    List<Post> getAllPosts();
}
