package github.factorymethod.shape;

import github.factorymethod.Props;

import java.lang.reflect.InvocationTargetException;

public class ShapeFactory {

    private ShapeFactory() {
        throw new IllegalStateException("Classe fabrica");
    }

    // Definido de forma estática na aplicação
//    public static Shape newShape() {
//    return new Circle();
//    }

    // Definido de forma dinâmica na aplicação de acordo com a configuração
    public static Shape newShape() {

        String shapeClass = Props.getString("shapeClass");
        try {
            Shape shape;
            shape = (Shape) Class.forName(shapeClass).getDeclaredConstructor().newInstance();

            String[] color = Props.getString("color").split(",");
            shape.defineColor(Integer.parseInt(color[0]), Integer.parseInt(color[1]), Integer.parseInt(color[2]));

            return shape;
        } catch (InstantiationException
                | IllegalAccessException
                | ClassNotFoundException
                | NoSuchMethodException
                | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static Shape newShape(int i) {
        if (i == 1) {
            return new Circle();
        } else if (i == 2) {
            return new Square();
        } else {
            return null;
        }
    }
}
