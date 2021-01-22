package github.singleton;

public class App {

    public static void main(String[] args) {

        SecurityManager1 sm1 = SecurityManager1.getInstance();
        sm1.login();

        SecurityManager1 sm2 = SecurityManager1.getInstance();
        sm2.login();
    }
}
