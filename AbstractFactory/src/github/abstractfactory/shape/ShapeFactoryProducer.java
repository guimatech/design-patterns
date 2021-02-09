package github.abstractfactory.shape;

public class ShapeFactoryProducer {

    public static ShapeAbstractFactory getFactory(boolean fill) {
        if (fill) {
            return new FillShapeFactory();
        } else {
            return new NotFillShapeFactory();
        }
    }
}
