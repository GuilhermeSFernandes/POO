package Ex3;

public class Funcionario extends Colaborador{
    protected String funcao;
    protected double salario;
    public Funcionario(String nome, String endereco, String dataInicio, String funcao, double salario) {
        super(nome, endereco, dataInicio);
        this.funcao = funcao;
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Função: " + funcao + "\n" +
                "Salário: " + salario;
    }
}
