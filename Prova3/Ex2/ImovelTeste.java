package Ex2;

public class ImovelTeste {
    public static void main(String[] args) {
        ImovelNovo imovelNovo = new ImovelNovo("Rua das Flores, 123", 30000, 500);
        System.out.println("Dados do Imóvel Novo:");
        imovelNovo.imprimirDados();
        System.out.println();

        // Criando um objeto do tipo ImovelVelho
        ImovelVelho imovelVelho = new ImovelVelho("Avenida Central, 456", 2500, 300);
        System.out.println("Dados do Imóvel Velho:");
        imovelVelho.imprimirDados();
    }
}
