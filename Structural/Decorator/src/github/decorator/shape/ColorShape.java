package github.decorator.shape;

import java.awt.*;

public class ColorShape extends ShapeDecorator {

    private Color color;

    public ColorShape(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw(Graphics graphics) {
        Graphics graphicsCopy = graphics.create();

        graphicsCopy.setColor(color);
        super.draw(graphicsCopy);

        graphicsCopy.dispose();
    }
}
