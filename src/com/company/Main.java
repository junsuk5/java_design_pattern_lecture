package com.company;

import com.company.adapter.Person;
import com.company.adapter.PersonAdapter;
import com.company.builder.Text;
import com.company.command.DrawingApp;
import com.company.decorator.FullBorder;
import com.company.decorator.SideBorder;
import com.company.decorator.TextWidget;
import com.company.factory.IDCard;
import com.company.observer.DigitObserver;
import com.company.observer.GraphicObserver;
import com.company.observer.Observer;
import com.company.observer.RandomGenerator;
import com.company.singleton.Singleton;
import com.company.strategy.Hand;
import com.company.strategy.Player;
import com.company.strategy.RandomStrategy;
import com.company.strategy.RockStrategy;
import com.company.template.*;

public class Main {

    public static void main(String[] args) {
        Text text = new Text.Builder()
                .setTitle("제목")
                .setContent("내용")
                .setItems("항목1", "항목2", "항목3")
                .build();

        System.out.println(text.toString());

        IDCard idCard = IDCard.Factory.create("오준석");
        IDCard idCard1 = IDCard.Factory.create("홍길동");

        idCard.use();
        idCard1.use();

        new FullBorder(
            new FullBorder(
                new SideBorder(
                    new TextWidget("hello world")
                )
            )
        ).show();

        new FullBorder(new TextWidget("안녕")).show();

        new DrawingApp("Command");

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }

        Person person = new Person("홍길동", 30);
        PersonAdapter adapter = new PersonAdapter(person);

        System.out.println(adapter.showName());
        System.out.println(adapter.showAge());

        RandomGenerator randomGenerator = new RandomGenerator();
        Observer observer = new DigitObserver();
        Observer observer2 = new GraphicObserver();
        Observer observer3 = number -> {
            for (int i = 0; i < number; i++) {
                System.out.print("=");
            }
            System.out.println();
        };

        randomGenerator.addObserver(observer);
        randomGenerator.addObserver(observer2);
        randomGenerator.addObserver(observer3);

        randomGenerator.execute();
        randomGenerator.execute();


        Player player1 = new Player("player1", new RandomStrategy());
        Player player2 = new Player("player2", new RockStrategy());
        Player player3 = new Player("player3", () -> Hand.Scissors);

        for (int i = 0; i < 10; i++) {
            System.out.println(player1.nextHand().fight(player2.nextHand()));
        }

        Hero hero = new Hero("용사");
        Hero hero2 = new Wizard("마법사");
        Monster monster = new Slime('A');
        Monster wolf = new Wolf('A');

        SuperHero superHero = new SuperHero("슈퍼맨");
        superHero.attack(monster);
        superHero.setFlying(true);

        hero2.attack(wolf);
        wolf.attack(hero2);

        hero.attack(monster);
    }
}
