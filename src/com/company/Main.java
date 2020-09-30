package com.company;

import com.company.strategy.*;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("player1", new RockStrategy());
        Player player2 = new Player("player2", new PaperStrategy());
        Player player3 = new Player("player3", new RandomStrategy());
        Player player4 = new Player("player4", () -> Hand.Scissors);

        for (int i = 0; i < 10; i++) {
            System.out.println(player1.nextHand().fight(player4.nextHand()));
        }
    }
}
