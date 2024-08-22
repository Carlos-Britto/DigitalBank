public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(int numero, Cliente titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo() + limite){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    //Getters and Setters
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
