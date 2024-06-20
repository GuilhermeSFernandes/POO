package Ex3;

public class Prestador extends Colaborador{
    protected double valorHora;
    protected String tipoServico;

    public Prestador(String nome, String endereco, String dataInicio, double valorHora, String tipoServico) {
        super(nome, endereco, dataInicio);
        this.valorHora = valorHora;
        this.tipoServico = tipoServico;
    }

    public double getValorHora() {
        return valorHora;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    @Override
    public String toString() {
        return super.toString() + "valor hora: "+ valorHora + "tipo servico: " + tipoServico;
    }
}
