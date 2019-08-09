package org.academiadecodigo.whiledlings.hackathon.controller.rest;

import javafx.geometry.Pos;
import org.academiadecodigo.whiledlings.hackathon.controller.command.PostDto;
import org.academiadecodigo.whiledlings.hackathon.controller.converter.PostDtoToPostConverter;
import org.academiadecodigo.whiledlings.hackathon.controller.converter.PostToPostDtoConverter;
import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;
import org.academiadecodigo.whiledlings.hackathon.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/post")
public class RestPostCtrl {

    private PostService postService;
    private PostDtoToPostConverter postDtoToPostConverter;
    private PostToPostDtoConverter postToPostDtoConverter;

    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @Autowired
    public void setPostDtoToPostConverter(PostDtoToPostConverter postDtoToPostConverter) {
        this.postDtoToPostConverter = postDtoToPostConverter;
    }

    @Autowired
    public void setPostToPostDtoConverter(PostToPostDtoConverter postToPostDtoConverter) {
        this.postToPostDtoConverter = postToPostDtoConverter;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/posts"})
    public ResponseEntity<List<Post>> listPosts() {

        List<PostDto> postDtos = new ArrayList<>();

        for(Post post : postService.getAllPosts()) {

            postDtos.add(postToPostDtoConverter.convert(post));
        }

        return new ResponseEntity(postDtos,HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/{id}"})
    public ResponseEntity<Post> getPostById(@PathVariable Integer id){

        Post post = postService.getPost(id);

        if(post == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
       return new ResponseEntity(postToPostDtoConverter.convert(post), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity addPost(@RequestBody PostDto postDto) {

        Post savedPost = postService.savePost(postDtoToPostConverter.converter(postDto));

        return new ResponseEntity(HttpStatus.CREATED);
    }


    @RequestMapping(method = RequestMethod.DELETE, path = {"/delete{id}"})
    public ResponseEntity deletePost(@PathVariable Integer id){

        postService.deletePost(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
