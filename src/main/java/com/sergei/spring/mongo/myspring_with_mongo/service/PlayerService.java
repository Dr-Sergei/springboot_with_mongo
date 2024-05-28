package com.sergei.spring.mongo.myspring_with_mongo.service;

import com.sergei.spring.mongo.myspring_with_mongo.model.Player;
import com.sergei.spring.mongo.myspring_with_mongo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player getPlayerById(String id) {
        return playerRepository.findById(id).orElse(null);
    }
}
