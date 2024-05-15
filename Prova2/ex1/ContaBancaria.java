package ex1;

public class ContaBancaria {
    private int numConta;
    private double saldo;
    private TitularBanco titular;

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public TitularBanco getTitular() {
        return titular;
    }

    public ContaBancaria(int numeroConta, TitularBanco titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.numConta = numeroConta;
    }

    public void imprimeTitular() {
        System.out.println("Titular da conta "+numConta +":");
        System.out.println("Nome: "+titular.getNome());
        System.out.println("CPF: "+titular.getCpf());
}
    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Saldo insuficiente");
            System.out.println("Valor disponivel :" +saldo);
        }else{
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso");
        }
    }
    public void depositar(double valor){
        if(valor < 0){
            System.out.println("Valor incorreto");
        }else{
            saldo += valor;
            System.out.println("Saque efetuado com sucesso");
        }
    }
}
