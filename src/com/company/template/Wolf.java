package com.company.template;

public class Wolf extends Monster {

    public Wolf(char prefix) {
        super(prefix);
    }

    @Override
    public void attack(Character character) {
        System.out.println("늑대 " + getPrefix() + "는 " + character.getName() + "를 물었다");
    }

    @Override
    public String getName() {
        return "늑대 " + getPrefix();
    }
}
