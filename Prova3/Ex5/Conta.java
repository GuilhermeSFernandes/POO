package Ex5;

public class Conta {
    PratoEntrada entrada;
    PratoPrincipal principal;
    PratoSobremesa sobremesa;
    private int totalConta;

    public void adicionarEntrada(PratoEntrada entrada) {
        this.entrada = entrada;
    }

    public void adicionarPrincipal(PratoPrincipal principal) {
        this.principal = principal;
    }

    public void adicionarSobremesa(PratoSobremesa sobremesa) {
        this.sobremesa = sobremesa;
    }

    public int calctotalConta(){
        totalConta = 0;
        totalConta = entrada.getPrecoUnitario() + principal.getPrecoUnitario() + sobremesa.getPrecoUnitario();
        totalConta += (totalConta * 0.10);
        return totalConta;
    }
    private String calcCliente(){
        return "Cliente";
    }
}
