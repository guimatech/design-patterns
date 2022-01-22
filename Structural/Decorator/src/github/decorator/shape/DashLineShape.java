package github.decorator.shape;

import java.awt.*;

public class DashLineShape extends ShapeDecorator {

    public DashLineShape(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics.create();

        BasicStroke stroke = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{ 9 }, 0);
        graphics2D.setStroke(stroke);

        super.draw(graphics2D);

        graphics2D.dispose();
    }
}
