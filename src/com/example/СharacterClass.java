package com.example;


import java.util.Random;

public abstract class СharacterClass implements Fighter{
    private String name = "";
    private int health;
    private int force;
    private int agility;
    private int gold;
    private int experience;
    private boolean destroyed = false;




    public СharacterClass(String name, int health, int force, int agility, int gold, int experience) {
        this.name = name;
        this.health = health;
        this.force = force;
        this.agility = agility;
        this.gold = gold;
        this.experience = experience;

    }

    @Override
    public int attack() {
        if (agility * 3 > getRandomValue() && agility % 5 == 0 ) return force * 2;
        else if (agility * 3 > getRandomValue()) return force;
        else return  0;
    }

    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }


    @Override
    public String toString() {
        return String.format("%s здоровье:%d", name, health);
    }

    public String getName() {
        return name;
    }

   public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }



}

