public class Banco {
    private int numAgencia;
    private int numConta;
    private double saldo;

    public Banco(int numAgencia, int numConta){
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = 0.0;
    }

    public int getNumAgencia() {
        return numAgencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public double depositar(double n){
        if(n < 0){
            System.out.println("Valor invalido");
        }else {
            saldo += n;
            System.out.println("Deposito efetuado com sucesso!");
        }
        return saldo;
    }
    public double sacar(double n){
        if (n <= saldo){
            saldo -= n;
            System.out.println("Saque efetuado");
        }else System.out.println("Saldo insuficiente");
        return saldo;
    }
    public void verificarSaldo(){
        System.out.println("Saldo : " + saldo);
    }

    @Override
    public String toString() {
        return "Numero agencia: \n" + numAgencia +
        "Numero conta: " + numConta;
    }
}
