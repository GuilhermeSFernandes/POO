package Ex3;

public class Empresa extends Prestador{
    private long cnpj;

    public Empresa(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cnpj) {
        super(nome, endereco, dataInicio, valorHora, tipoServico);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString()+ "cnpj: " + cnpj;
    }
}
