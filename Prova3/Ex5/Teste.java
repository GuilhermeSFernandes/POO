package Ex5;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João",1232);

        PratoEntrada entrada = new PratoEntrada(1, "Salada Caesar", "Alface, croutons, parmesão, molho Caesar", 19);
        PratoPrincipal principal = new PratoPrincipal(1, "Filé à Parmegiana", "Filé empanado, molho de tomate, queijo mussarela", 39);
        PratoSobremesa sobremesa = new PratoSobremesa(1, "Pudim de Leite", "Leite condensado, leite, ovos, açúcar", 12);

        cliente.getConta().adicionarEntrada(entrada);
        cliente.getConta().adicionarPrincipal(principal);
        cliente.getConta().adicionarSobremesa(sobremesa);

        double totalConta = cliente.getConta().calctotalConta();
        System.out.println("Total da Conta: R$" + totalConta);
    }
}
