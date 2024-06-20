package Ex4;

public class CinemaTeste {
    public static void main(String[] args) {
        Filme filme = new Filme("Matrix", 136);
        Sala sala = new Sala(1, 100);
        CinemaSessao sessao = new CinemaSessao(20, 8,filme, sala);

        sessao.venderIngresso(10);
        sessao.venderIngresso(95);  // Deve exibir uma mensagem informando que não há ingressos suficientes

        sessao.exibirRelatorio();
    }
}
