package org.academiadecodigo.whiledlings.hackathon.controller.rest;

import org.academiadecodigo.whiledlings.hackathon.persistence.model.Post;
import org.academiadecodigo.whiledlings.hackathon.persistence.model.UserModel;
import org.academiadecodigo.whiledlings.hackathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestUserCtrl {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(method = RequestMethod.GET, path = {"/users"})
    public ResponseEntity<List<Post>> listUsers()
    {
        return new ResponseEntity(userService.getAllUsers(),HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = {"user/{id}"})
    public ResponseEntity<Post> getUserById(@PathVariable Integer id){
        
       return new ResponseEntity(userService.getUser(id), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<?> addUser(@RequestBody UserModel user) {

        UserModel savedUser = userService.saveUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @RequestMapping(method = RequestMethod.DELETE, path = {"/user/delete{id}"})
    public ResponseEntity deleteUser(@PathVariable Integer id){

        userService.deleteUser(id);
        return new ResponseEntity(HttpStatus.OK);
    }


}
