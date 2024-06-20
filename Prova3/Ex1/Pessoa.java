package Ex1;

public class Pessoa {
    protected String nome;
    protected String nascimento;
    protected Long rg;
    protected Long cpf;
    public Pessoa(String nome, String nascimento, Long rg, Long cpf) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.rg = rg;
        this.cpf = cpf;

    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + nascimento);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
    }
}
