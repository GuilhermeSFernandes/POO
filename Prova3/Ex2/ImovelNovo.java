package Ex2;

public class ImovelNovo extends Imovel{
    int adicional;
    public ImovelNovo(String endereco, int valor, int adicional) {
        super(endereco, valor);
        this.adicional = adicional;
    }

    public void setAdicional(int adicional) {
        this.adicional = adicional;
    }
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Adicional no Preço: " + adicional);
        System.out.println("Valor Total: " + (getValor() + adicional));
    }
}
