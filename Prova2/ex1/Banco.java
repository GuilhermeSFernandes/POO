package ex1;

import java.util.List;
import java.util.ArrayList;

public class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<ContaBancaria>();
    }

    public void criarConta(int numeroConta, TitularBanco titular) {
        ContaBancaria contaBancaria = new ContaBancaria(numeroConta, titular);
        this.contas.add(contaBancaria);
    }

    public void sacar(int numConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumConta() == numConta) {
                conta.sacar(valor);
                return;
            }
        }
        System.out.println("Conta não encontrada!");
    }

    public void depositar(int numConta, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumConta() == numConta) {
                conta.depositar(valor);
                return;
            }
        }
        System.out.println("Conta não encontrada!");
    }

    public void verificarSaldo(int numConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumConta() == numConta) {
                System.out.println("Saldo atual da conta " + numConta + ": R$" + conta.getSaldo());
                return;
            }
        }
        System.out.println("Conta não encontrada!");
    }
}
