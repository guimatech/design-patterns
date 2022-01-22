package github.abstractfactory.shape;

import java.awt.Graphics;

public class FillSquare extends Shape {

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.fillRect(0, 0, 100, 100);
    }
}
