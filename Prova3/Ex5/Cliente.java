package Ex5;

public class Cliente {
    private String nome;
    private int cpf;
    Conta conta;

    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = new Conta();
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public Conta getConta() {
        return conta;
    }
}
