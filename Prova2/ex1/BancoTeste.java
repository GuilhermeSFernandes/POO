package ex1;

public class BancoTeste {
    public static void main(String[] args) {
        TitularBanco n1 = new TitularBanco("Guilherme" , 130985);
        TitularBanco n2 = new TitularBanco("Rafa", 1234);
        Banco banco = new Banco();
        banco.criarConta(111, n1);
        banco.criarConta(112, n2);
        banco.verificarSaldo(111);
        banco.depositar(111,1000);
        banco.verificarSaldo(111);
        banco.verificarSaldo(112);
    }
}
