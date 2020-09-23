package com.company;

import com.company.decorator.FullBorder;
import com.company.decorator.Scaffold;
import com.company.decorator.SideBorder;
import com.company.decorator.TextWidget;

public class Main {

    public static void main(String[] args) {
        new Scaffold(
            new FullBorder(
                new SideBorder(
                    new FullBorder(
                        new SideBorder(
                            new TextWidget("hello world")
                        )
                    )
                )
            )
        );
    }
}
