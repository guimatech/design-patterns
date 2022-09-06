package github.strategy;

public class RunMovement implements Movement {

    @Override
    public void move(int distance) {
        int currentDistance = 0;

        while (currentDistance < distance) {
            currentDistance++;

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Distância percorrida: " + currentDistance + "m");
        }
    }
}
