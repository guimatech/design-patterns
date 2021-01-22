package github.singleton;

// Forma 1: Usando lazyload/"preguiçoso", a instância só é criada quando eu preciso dela
// Gerenciador de segurança para aplicação inteira
public class SecurityManager1 {

    private static SecurityManager1 instance;

    private SecurityManager1() {}

    public static SecurityManager1 getInstance() {
        if (instance == null) {
            return new SecurityManager1();
        }
        return instance;
    }

    public void login() {}
}
