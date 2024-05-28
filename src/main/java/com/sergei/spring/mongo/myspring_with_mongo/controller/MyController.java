package com.sergei.spring.mongo.myspring_with_mongo.controller;

import com.sergei.spring.mongo.myspring_with_mongo.model.Player;
import com.sergei.spring.mongo.myspring_with_mongo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/players")
public class MyController {

    @Autowired
    private PlayerService playerService;


    @GetMapping("/{id}")
    public Player gerPlayerById(@PathVariable String id){
        return playerService.getPlayerById(id);
    }


    @PostMapping
    public Player createPlayer(@RequestBody Player player){
        return playerService.createPlayer(player);
    }
}
