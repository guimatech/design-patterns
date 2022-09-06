package github.templatemethod;

public class Suco extends Bebida {
    @Override
    protected void adicionarAgua() {
        System.out.println("Adicionando água ao suco");
    }

    @Override
    protected void adicionarSubstancia() {
        System.out.println("Adicionando suco");
    }

    @Override
    protected boolean colocarAcucar() {
        return true;
    }

    @Override
    protected void adicionarAcucar() {
        System.out.println("Adicionando açucar ao suco");
    }

    @Override
    protected void mexer() {
        System.out.println("Mexendo o suco");
    }
}
