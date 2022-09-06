package github.strategy;


public class App {

    public static void main(String[] args) {

        Person jose  = new Person("José");
        jose.move(new RunMovement(), 50);
    }
}
