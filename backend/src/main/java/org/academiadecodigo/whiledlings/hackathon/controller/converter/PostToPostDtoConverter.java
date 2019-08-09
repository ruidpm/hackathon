package org.academiadecodigo.whiledlings.hackathon.controller.converter;


import org.academiadecodigo.whiledlings.hackathon.controller.command.PostDto;
import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;
import org.springframework.stereotype.Component;

@Component
public class PostToPostDtoConverter {

    public PostDto convert(Post post) {

        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setMessage(post.getMessage());
        postDto.setEmail(post.getEmail());
        postDto.setTitle(post.getTitle());
        postDto.setUrl(post.getUrl());

        return postDto;
    }
}
