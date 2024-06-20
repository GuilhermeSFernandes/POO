package Ex3;

public class Colaborador {
    protected String nome;
    protected String endereco;
    protected String dataInicio;
    public Colaborador(String nome, String endereco, String dataInicio) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataInicio = dataInicio;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataInicio='" + dataInicio + '\'' +
                '}';
    }
}
