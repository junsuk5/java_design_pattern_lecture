package com.company.factory;

public class IDCard implements Product {
    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "님의 카드를 사용합니다.");
    }

    public static class Factory {
        public static IDCard create(String owner) {
            return new IDCard(owner);
        }
    }
}
