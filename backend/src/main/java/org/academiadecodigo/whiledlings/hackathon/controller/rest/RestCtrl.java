package org.academiadecodigo.whiledlings.hackathon.controller.rest;

import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;
import org.academiadecodigo.whiledlings.hackathon.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestCtrl {

    private PostService postService;

    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }


    @RequestMapping(method = RequestMethod.GET, path = {"/posts"})
    public ResponseEntity<List<Post>> listQuotess()
    {
        return new ResponseEntity(postService.getAllPosts(),HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = {"post/{id}"})
    public ResponseEntity<Post> getPostById(@PathVariable Integer id){
        
       return new ResponseEntity(postService.getPost(id), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<?> addCustomer(@RequestBody Post post) {

        Post savedPost = postService.savePost(post);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @RequestMapping(method = RequestMethod.DELETE, path = {"delete{id}"})
    public ResponseEntity deletePost(@PathVariable Integer id){

        postService.deletePost(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
