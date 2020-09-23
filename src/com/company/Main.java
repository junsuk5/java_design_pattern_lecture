package com.company;

import com.company.factory.Factory;
import com.company.factory.IDCard;
import com.company.factory.IDCardFactory;
import com.company.factory.Product;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product idCard1 = factory.createProduct("홍길동");
        Product idCard2 = factory.createProduct("한석봉");

        idCard1.use();
        idCard2.use();

        IDCard idCard3 = IDCard.Factory.create("신사임당");
        idCard3.use();


//        Text text = new Text.Builder()
//                .setTitle("hello")
//                .setContent("내용")
//                .setItems("항목1", "항목2", "항목3")
//                .build();
//
//        System.out.println(text);
    }
}
