package Aula2;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Gol";
        carro1.marca = "Volks";
        carro1.ano = 2015;
        carro1.placa = "FBL0B56";
        carro1.cor = "Vermelho";
        System.out.println("Modelo:" + carro1.modelo);
        System.out.println("Marca:" + carro1.marca);
        System.out.println("Ano:" + carro1.ano);
        System.out.println("Placa:" + carro1.placa);
        System.out.println("Cor:" + carro1.cor);
        carro1.ligar();
        carro1.acelerar();
        carro1.freiar();
        carro1.desligar();
    }
}
