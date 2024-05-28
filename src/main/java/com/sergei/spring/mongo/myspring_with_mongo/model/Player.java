package com.sergei.spring.mongo.myspring_with_mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("players")
public class Player {

    @Id
    private String id;

    private String name;
    private int age;
    private String race;
    private int HP;
    private int AP;

    public Player(final String id, final String name, final int age, final String race) {

        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.race = race;
        this.HP = 200;
        this.AP = 25;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(final String race) {
        this.race = race;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(final int HP) {
        this.HP = HP;
    }

    public int getAP() {
        return AP;
    }

    public void setAP(final int AP) {
        this.AP = AP;
    }
}
