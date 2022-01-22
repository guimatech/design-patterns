package github.abstractfactory;

import github.abstractfactory.gui.Window;
import github.abstractfactory.shape.Shape;
import github.abstractfactory.shape.ShapeAbstractFactory;
import github.abstractfactory.shape.ShapeFactoryProducer;

public class App {

    public static void main(String[] args) {

        Window window = new Window("Shapes", 300, 300);
        window.show();

        ShapeAbstractFactory factory = ShapeFactoryProducer.getFactory(false);
        Shape shape = factory.newShape("circle");

        window.drawShape(shape);
    }
}
