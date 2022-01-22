package github.composite;

public class App {

    public static void main(String[] args) {
        SceneGroup group1 = new SceneGroup();

        Triangle triangle1 = new Triangle();
        SceneGroup group2 = new SceneGroup();

        group1.add(triangle1);
        group1.add(group2);

        Triangle triangle2 = new Triangle();
        Rectangle rectangle1 = new Rectangle();

        group2.add(triangle2);
        group2.add(rectangle1);

        SceneGroup group3 = new SceneGroup();

        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();
        group3.add(rectangle2);
        group3.add(rectangle3);

        group2.add(group3);

        group1.draw();
    }
}
