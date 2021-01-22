package github.singleton;

// Forma 3: Para usar com threads e prevenir da "região crítica"
// Gerenciador de segurança para aplicação inteira
public class SecurityManager3 {

    private static SecurityManager3 instance;

    private SecurityManager3() {}

    // Problema: Assim resolve, porém métodos "synchronized" são mais lentos que outros métodos
    // ver se isso não vai causar atrasos
//    public synchronized static SecurityManager3 getInstance() {
//        if (instance == null) {
//            return new SecurityManager3();
//        }
//        return instance;
//    }

    // Apesar de complexa, com essa implementação você está totalmente protegido num ambiente multi-thread
    // e evita processamento desnecessário
    public static SecurityManager3 getInstance() {
        if (instance == null) {
            synchronized (SecurityManager3.class) {
                if (instance == null) {
                    return new SecurityManager3();
                }
            }
        }
        return instance;
    }

    public void login() {}
}
