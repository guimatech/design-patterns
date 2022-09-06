package github.templatemethod;

public class Cha extends Bebida {
    @Override
    protected void adicionarAgua() {
        System.out.println("Adicionando água ao chá");
    }

    @Override
    protected void adicionarSubstancia() {
        System.out.println("Adicionando chá");
    }

    @Override
    protected boolean colocarAcucar() {
        return false;
    }

    @Override
    protected void adicionarAcucar() { }

    @Override
    protected void mexer() {
        System.out.println("Mexendo o chá");
    }
}
