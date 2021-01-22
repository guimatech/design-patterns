package github.singleton;

// Forma 2: A instância é criada mesmo antes de você precisar dela
// Reflexão: Vale a pena deixar essa instância criada desde o início
// Gerenciador de segurança para aplicação inteira
public class SecurityManager2 {

    private static SecurityManager2 instance;

    // Poderia criar no momento da declaração do atributo, mas usando o bloco "static" posso tratar as exceções
    static {
        try {
            instance = new SecurityManager2();
        } catch (Exception e) {
            // tratar exceção
        }
    }

    private SecurityManager2() {}

    public static SecurityManager2 getInstance() {
        return instance;
    }

    public void login() {}
}
