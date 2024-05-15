package ex1;

public class TitularBanco {
    private String nome;
    private int cpf;

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public TitularBanco(String nome, int cpf){
        this.nome =  nome;
        this.cpf = cpf;
    }
}
