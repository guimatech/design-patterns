package github.abstractfactory.shape;

public class FillShapeFactory extends ShapeAbstractFactory{

    @Override
    public Shape newShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new FillCircle();
        } else if (type.equalsIgnoreCase("square")) {
            return new FillSquare();
        }

        return null;
    }
}
