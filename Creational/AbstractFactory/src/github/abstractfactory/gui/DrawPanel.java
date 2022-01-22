package github.abstractfactory.gui;

import github.abstractfactory.shape.Shape;

import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {

    private Shape shape;

    public void drawShape(Shape shape) {
        this.shape = shape;
        repaint();
    }

    @Override
    public void paint(Graphics graphics) {
        if (shape != null) {
            shape.draw(graphics);
        }
    }
}