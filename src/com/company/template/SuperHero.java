package com.company.template;

public class SuperHero extends Hero {
    private boolean isFlying = false;

    public SuperHero(String name) {
        super(name);
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        System.out.println(getName() + "은 날았다");
        isFlying = flying;
    }

    @Override
    public void attack(Character character) {
        System.out.println(getName() + "는 " + character.getName() + "를 공격했다");
    }
}
