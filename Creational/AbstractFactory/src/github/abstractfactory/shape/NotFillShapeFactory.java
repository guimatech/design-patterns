package github.abstractfactory.shape;

public class NotFillShapeFactory extends ShapeAbstractFactory{

    @Override
    public Shape newShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new NotFillCircle();
        } else if (type.equalsIgnoreCase("square")) {
            return new NotFillSquare();
        }

        return null;
    }
}
