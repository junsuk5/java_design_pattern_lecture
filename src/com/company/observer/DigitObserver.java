package com.company.observer;

public class DigitObserver implements Observer {

    @Override
    public void update(int number) {
        System.out.println("숫자 : " + number);
    }
}
