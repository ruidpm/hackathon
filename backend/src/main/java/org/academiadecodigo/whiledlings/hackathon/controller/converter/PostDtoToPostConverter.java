package org.academiadecodigo.whiledlings.hackathon.controller.converter;

import org.academiadecodigo.whiledlings.hackathon.controller.command.PostDto;
import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;
import org.academiadecodigo.whiledlings.hackathon.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostDtoToPostConverter {

    private PostService postService;

    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    public Post converter(PostDto postDto) {

        Post post = (postDto.getId() != null ?
                postService.getPost(postDto.getId()) : new Post());

        post.setTitle(postDto.getTitle());
        post.setMessage(postDto.getMessage());
        post.setEmail(postDto.getEmail());
        post.setUrl(postDto.getUrl());

        return post;
    }
}
