package Ex3;

public class Estagiario extends Funcionario{
    private int ciee;

    public Estagiario(String nome, String endereco, String dataInicio, String funcao, double salario, int ciee) {
        super(nome, endereco, dataInicio, funcao, salario);
        this.ciee = ciee;
    }

    @Override
    public String toString() {
        return super.toString() + "ciee: " + ciee;
    }
}
