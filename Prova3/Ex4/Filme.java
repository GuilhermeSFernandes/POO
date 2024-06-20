package Ex4;

public class Filme {
    private String nome;
    private int duracao;

    public Filme(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }
}
