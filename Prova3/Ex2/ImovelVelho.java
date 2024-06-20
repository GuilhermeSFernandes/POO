package Ex2;

public class ImovelVelho extends Imovel{
    int desconto;
    public ImovelVelho(String endereco, int valor, int desconto) {
        super(endereco, valor);
        this.desconto = desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Desconto no Preço: " + desconto);
        System.out.println("Valor Total: " + (getValor() - desconto));
    }
}
