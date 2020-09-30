package com.company.template;

public class Hero implements Character {
    private String name;
    private int hp;

    public Hero(String name) {
        this.name = name;
        hp = 100;
    }

    @Override
    public void attack(Character character) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
