package org.academiadecodigo.whiledlings.hackathon.controller;

import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;
import org.academiadecodigo.whiledlings.hackathon.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;


@RestController
@RequestMapping("/api")
public class TestController {

    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @Autowired
    private PostService postService;

        @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
        public ResponseEntity listQuotes()
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }



    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<?> addCustomer(@RequestBody Post post) {


        Post savedPost = postService.savePost(post);



        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
