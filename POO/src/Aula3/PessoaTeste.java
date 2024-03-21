package Aula3;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.nome = "Joao";
        pessoa1.idade = 25;
        pessoa1.peso = 68.5;

        pessoa2.nome = "Maria";
        pessoa2.idade = 30;
        pessoa2.peso = 55.6;

        pessoa3.nome = "Jose";
        pessoa3.idade = 32;
        pessoa3.peso = 62.4;

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade : " + pessoa1.idade);
        System.out.println("Peso: " + pessoa1.peso);

        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade : " + pessoa2.idade);
        System.out.println("Peso: " + pessoa2.peso);

        System.out.println("Nome: " + pessoa3.nome);
        System.out.println("Idade : " + pessoa3.idade);
        System.out.println("Peso: " + pessoa3.peso);
    }
}
