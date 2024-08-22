public class ContaPoupanca extends Conta{
    private double rendimentoMensal;

    public ContaPoupanca(int numero, Cliente titular, double rendimentoMensal) {
        super(numero, titular);
        this.rendimentoMensal = rendimentoMensal;
    }

    public void aplicarRendimento(){
        setSaldo(getSaldo() * (1 + rendimentoMensal));
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    //Getters and Setters

    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    public void setRendimentoMensal(double rendimentoMensal) {
        this.rendimentoMensal = rendimentoMensal;
    }
}
