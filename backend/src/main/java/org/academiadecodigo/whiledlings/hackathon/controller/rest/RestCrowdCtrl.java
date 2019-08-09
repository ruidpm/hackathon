package org.academiadecodigo.whiledlings.hackathon.controller.rest;


import org.academiadecodigo.whiledlings.hackathon.controller.command.CrowdPostDto;
import org.academiadecodigo.whiledlings.hackathon.controller.converter.CrowdPostDtoToCrowdPostConverter;
import org.academiadecodigo.whiledlings.hackathon.controller.converter.CrowdPostToCrowdPostDtoConverter;
import org.academiadecodigo.whiledlings.hackathon.persistence.model.CrowdPost;
import org.academiadecodigo.whiledlings.hackathon.services.CrowdPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequestMapping("/api/crowdpost")
public class RestCrowdCtrl {

    private CrowdPostService crowdPostService;
    private CrowdPostDtoToCrowdPostConverter crowdPostDtoToCrowdPostConverter;
    private CrowdPostToCrowdPostDtoConverter crowdPostToCrowdPostDtoConverter;

    @Autowired
    public void setCrowdPostService(CrowdPostService crowdPostService) {
        this.crowdPostService = crowdPostService;
    }

    @Autowired
    public void setCrowdPostDtoToCrowdPostConverter(CrowdPostDtoToCrowdPostConverter crowdPostDtoToCrowdPostConverter) {
        this.crowdPostDtoToCrowdPostConverter = crowdPostDtoToCrowdPostConverter;
    }

    @Autowired
    public void setCrowdPostToCrowdPostDtoConverter(CrowdPostToCrowdPostDtoConverter crowdPostToCrowdPostDtoConverter) {
        this.crowdPostToCrowdPostDtoConverter = crowdPostToCrowdPostDtoConverter;
    }

    @RequestMapping(method = RequestMethod.GET, path ={"/crowdposts"})
    public ResponseEntity<List<CrowdPost>> listCrowdPosts() {

        List<CrowdPostDto> crowdPostDtos = new ArrayList<>();

        for(CrowdPost crowdPost: crowdPostService.getAllPosts()) {

            crowdPostDtos.add(crowdPostToCrowdPostDtoConverter.convert(crowdPost));

        }

        return new ResponseEntity(crowdPostDtos, HttpStatus.OK);

    }

    @RequestMapping(method = RequestMethod.GET, path ={"/{id}"})
    public ResponseEntity<CrowdPost> getCrowdPostById(@PathVariable Integer id) {

        CrowdPost crowdPost = crowdPostService.getPost(id);

        if (crowdPost == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(crowdPostToCrowdPostDtoConverter.convert(crowdPost), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity addCrowdPost(@RequestBody CrowdPostDto crowdPostDto) {

        CrowdPost crowdPost = crowdPostService.savePost(crowdPostDtoToCrowdPostConverter.converter(crowdPostDto));

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/delete{id}"})
    public ResponseEntity deleteCrowdPost(@PathVariable Integer id) {

        crowdPostService.deletePost(id);

        return new ResponseEntity(HttpStatus.OK);
    }






}
