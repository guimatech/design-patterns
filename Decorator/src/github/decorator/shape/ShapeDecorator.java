package github.decorator.shape;

import java.awt.*;

public abstract class ShapeDecorator implements Shape {

    private Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(Graphics graphics) {
        shape.draw(graphics);
    }
}
