package com.company;

import com.company.builder.Text;
import com.company.factory.Factory;
import com.company.factory.IDCard;
import com.company.factory.IDCardFactory;
import com.company.factory.Product;
import com.company.singleton.Singleton;
import com.sun.xml.internal.bind.v2.model.core.ID;

public class Main {

    public static void main(String[] args) {
        Text text = new Text.Builder()
                .setTitle("hello")
                .setContent("내용")
                .setItems("항목1", "항목2", "항목3")
                .build();

        System.out.println(text);


        Factory factory = new IDCardFactory();
        Product idCard1 = factory.createProduct("홍길동");
        Product idCard2 = factory.createProduct("한석봉");

        idCard1.use();
        idCard2.use();

        IDCard idCard3 = IDCard.Factory.create("신사임당");
        idCard3.use();


        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }
    }
}
