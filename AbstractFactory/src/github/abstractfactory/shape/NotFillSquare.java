package github.abstractfactory.shape;

import java.awt.Graphics;

public class NotFillSquare extends Shape {

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.drawRect(0, 0, 100, 100);
    }
}
