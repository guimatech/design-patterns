package github.abstractfactory.shape;

import java.awt.*;

public abstract class Shape {

    private Color color;

    public abstract void draw(Graphics graphics);

    public void defineColor(int r, int g, int b) {
        this.color = new Color(r, g, b);
    }

    public Color getColor() {
        return color;
    }
}
