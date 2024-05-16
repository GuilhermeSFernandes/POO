package EX4;

public class EstacionamentoTeste {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("ABC123");
        Veiculo v1 = new Veiculo("1234");
        Vaga vaga = new Vaga(11);
        Vaga vaga1 = new Vaga(10);

        // Estaciona o primeiro veículo na vaga às 10 horas
        vaga.addVeiculo(v, 10);
        vaga.info();

        // Remove o veículo da vaga às 15 horas

        // Estaciona o segundo veículo na mesma vaga às 1 hora
        vaga1.addVeiculo(v1, 1);
        vaga1.info();
    }
}
