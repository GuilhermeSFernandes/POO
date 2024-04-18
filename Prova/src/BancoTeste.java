public class BancoTeste {
    public static void main(String[] args) {
        Banco b = new Banco(10,10);
        b.depositar(100);
        System.out.println(b);
        b.verificarSaldo();
        b.sacar(50);
        b.verificarSaldo();
        b.sacar(60);
        b.sacar(40);
        b.verificarSaldo();
    }
}
