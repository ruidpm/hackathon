package org.academiadecodigo.whiledlings.hackathon.controller.converter;


import org.academiadecodigo.whiledlings.hackathon.controller.command.CrowdPostDto;
import org.academiadecodigo.whiledlings.hackathon.persistence.model.CrowdPost;
import org.academiadecodigo.whiledlings.hackathon.services.CrowdPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CrowdPostDtoToCrowdPostConverter {

    private CrowdPostService crowdPostService;

    @Autowired
    public void setCrowdPostService(CrowdPostService crowdPostService) {
        this.crowdPostService = crowdPostService;
    }

    public CrowdPost converter(CrowdPostDto crowdPostDto) {

        CrowdPost crowdPost = (crowdPostDto.getId() != null ?
                crowdPostService.getPost(crowdPostDto.getId()) : new CrowdPost());


        crowdPost.setTitle(crowdPostDto.getTitle());
        crowdPost.setMessage(crowdPostDto.getMessage());
        crowdPost.setEmail(crowdPostDto.getEmail());
        crowdPost.setUrl(crowdPostDto.getUrl());
        crowdPost.setMoneyNeeded(crowdPostDto.getMoneyNeeded());
        crowdPost.setMoneyDonated(crowdPostDto.getMoneyDonated());

        return crowdPost;
    }
}
