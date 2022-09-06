package github.templatemethod;

public abstract class Bebida {
    
    public void preparar() {
        adicionarAgua();
        adicionarSubstancia();

        if (colocarAcucar())
            adicionarAcucar();
        
        mexer();
    }

    protected abstract void adicionarAgua();

    protected abstract void adicionarSubstancia();

    protected abstract boolean colocarAcucar();

    protected abstract void adicionarAcucar();

    protected abstract void mexer();
}
