package com.company.strategy;

public class Player {
    private Strategy strategy;
    private String name;
    private int life = 3;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }
}
