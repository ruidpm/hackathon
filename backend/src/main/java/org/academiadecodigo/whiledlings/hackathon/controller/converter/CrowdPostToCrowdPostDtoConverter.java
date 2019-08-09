package org.academiadecodigo.whiledlings.hackathon.controller.converter;

import org.academiadecodigo.whiledlings.hackathon.controller.command.CrowdPostDto;
import org.academiadecodigo.whiledlings.hackathon.persistence.model.CrowdPost;
import org.springframework.stereotype.Component;

@Component
public class CrowdPostToCrowdPostDtoConverter {

    public CrowdPostDto convert(CrowdPost crowdPost) {

        CrowdPostDto crowdPostDto = new CrowdPostDto();
        crowdPostDto.setId(crowdPost.getId());
        crowdPostDto.setMessage(crowdPost.getMessage());
        crowdPostDto.setEmail(crowdPost.getEmail());
        crowdPostDto.setTitle(crowdPost.getTitle());
        crowdPostDto.setUrl(crowdPost.getUrl());
        crowdPostDto.setMoneyNeeded(crowdPost.getMoneyNeeded());
        crowdPostDto.setMoneyDonated(crowdPost.getMoneyDonated());

        return crowdPostDto;
    }
}
