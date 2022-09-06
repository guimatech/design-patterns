package github.strategy;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void move(Movement movement, int distance) {
        System.out.println(name + " iniciou o movimento");
        movement.move(distance);
        System.out.println(name + " terminou o trajeto");
    }
}