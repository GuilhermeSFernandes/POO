public class Endereco {
    String nomeRua;
    int num;
    String bairro;
    String cidade;
    String estado;

    public Endereco(String nomeRua, int num, String bairro, String cidade, String estado){
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.num = num;
        this.nomeRua = nomeRua;
    }

    @Override
    public String toString() {
        return nomeRua + " , " + num + " , " + bairro + " , " + cidade + " , " + estado;
    }
}
