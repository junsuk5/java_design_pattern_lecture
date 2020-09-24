package com.company.command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    private int radius = 5;

    public DrawCanvas(int width, int height) {
        setSize(width, height);
        setBackground(Color.white);
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(Color.red);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
