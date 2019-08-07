package org.academiadecodigo.whiledlings.hackathon.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/hackathon")
public class TestController {

        @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
        public ResponseEntity listQuotes() {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
