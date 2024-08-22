public abstract class Conta {
    private int numero;
    private double saldo;
    private Cliente titular;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }
    }

    public void transferir(double valor, Conta destino){
        if (sacar(valor)){
            destino.depositar(valor);
        }
    }

    public abstract boolean sacar(double valor);

    //Getters and Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }
}
