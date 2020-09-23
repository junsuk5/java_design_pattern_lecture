package com.company.factory;

public class IDCardFactory implements Factory {

    @Override
    public Product createProduct(String name) {
        return new IDCard(name);
    }
}
