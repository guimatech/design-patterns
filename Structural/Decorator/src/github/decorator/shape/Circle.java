package github.decorator.shape;

import java.awt.Graphics;

public class Circle implements Shape {

    @Override
    public void draw(Graphics graphics) {
        graphics.drawOval(0, 0, 50, 50);
    }
}
