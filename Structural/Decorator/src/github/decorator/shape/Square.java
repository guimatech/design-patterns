package github.decorator.shape;

import java.awt.Graphics;

public class Square implements Shape {

    @Override
    public void draw(Graphics graphics) {
        graphics.drawRect(0, 0, 100, 100);
    }
}