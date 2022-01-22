package github.factorymethod.shape;

import java.awt.*;

public class Square extends Shape {

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.fillRect(0, 0, 100, 100);
    }
}
