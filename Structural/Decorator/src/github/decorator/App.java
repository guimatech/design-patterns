package github.decorator;

import github.decorator.gui.Window;
import github.decorator.shape.*;
import github.decorator.shape.Shape;

import java.awt.*;

public class App {
    public static void main(String[] args) {

        Window w = new Window("Shapes", 300, 300);
        w.show();

        Shape shape = new DashLineShape(new ColorShape(new Square(), Color.GREEN));

        w.drawShape(shape);
    }
}
