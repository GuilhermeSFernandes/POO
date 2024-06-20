package Ex3;

public class Autonomo extends Prestador{
    private long cpf;
    public Autonomo(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cpf) {
        super(nome, endereco, dataInicio, valorHora, tipoServico);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString()+ "cpf: " + cpf;
    }
}
