package github.factorymethod;

import github.factorymethod.gui.Window;
import github.factorymethod.shape.Shape;
import github.factorymethod.shape.ShapeFactory;

public class App {

    public static void main(String[] args) {

        Window window = new Window("Shapes", 300, 300);
        window.show();

        Shape shape = ShapeFactory.newShape();

        window.drawShape(shape);
    }
}
