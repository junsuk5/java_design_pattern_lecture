package com.company;

import com.company.template.*;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero("용사");
        Hero hero2 = new Wizard("마법사");
        Monster monster = new Slime('A');
        Monster wolf = new Wolf('A');

        SuperHero superHero = new SuperHero("슈퍼맨");
        superHero.attack(monster);
        superHero.setFlying(true);

        hero2.attack(wolf);
        wolf.attack(superHero);

        hero.attack(monster);
    }
}
