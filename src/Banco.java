import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente){
        clientes.remove(cliente);
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void removerConta(Conta conta){
        contas.remove(conta);
    }

    //Getters and Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Cliente> getClientes(){
        return clientes;
    }

    public void setClientes(List<Cliente> clientes){
        this.clientes = clientes;
    }

    public List<Conta> getContas(){
        return contas;
    }

    public void setContas(List<Conta> contas){
        this.contas = contas;
    }

}
