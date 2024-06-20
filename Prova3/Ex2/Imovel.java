package Ex2;

public class Imovel {
    protected String endereco;
    protected int valor;

    public Imovel(String endereco, int valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getValor() {
        return valor;
    }

    public void imprimirDados() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor Base: " + valor);
    }
}
