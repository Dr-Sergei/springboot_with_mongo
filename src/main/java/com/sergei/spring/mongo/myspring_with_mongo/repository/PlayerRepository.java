package com.sergei.spring.mongo.myspring_with_mongo.repository;

import com.sergei.spring.mongo.myspring_with_mongo.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PlayerRepository extends MongoRepository<Player, String> {

    @Query("{nane:'?0'}")
    Player findPlayerByName(String name);

    @Query(value = "{race:'?0'}", fields = "{'name' : 1. 'quantity': 1}")
    List<Player> findAll(String race);

    public long count();
}
