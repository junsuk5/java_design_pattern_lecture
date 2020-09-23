package com.company;

import com.company.adapter.Person;
import com.company.adapter.PersonAdapter;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("홍길동", 30);
        PersonAdapter adapter = new PersonAdapter(person);

        System.out.println(adapter.showName());
        System.out.println(adapter.showAge());
    }
}
