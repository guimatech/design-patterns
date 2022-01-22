package github.abstractfactory.shape;

import java.awt.Graphics;

public class NotFillCircle extends Shape {

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.drawOval(0, 0, 50, 50);
    }
}