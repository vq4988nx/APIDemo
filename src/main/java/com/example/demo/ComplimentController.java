package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by vq4988nx on 4/12/2018.
 */

@RestController
public class ComplimentController {

    private Compliment[] compliments = {
        new Compliment("You look mighty fine"),
            new Compliment("You sure are great"),
            new Compliment("You are really just fantastic")
    };

    private Random rnd = new Random();

    @RequestMapping("/random")
    ResponseEntity<Compliment> randomCompliment() {
        Compliment randomCompliment = compliments[rnd.nextInt(compliments.length)];
        return new ResponseEntity<>(randomCompliment, HttpStatus.OK);
    }
}
