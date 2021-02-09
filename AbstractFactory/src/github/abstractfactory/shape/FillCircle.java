package github.abstractfactory.shape;

import java.awt.*;

public class FillCircle extends Shape {

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.fillOval(0, 0, 50, 50);
    }
}
