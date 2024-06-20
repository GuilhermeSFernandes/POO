package Ex4;

public class CinemaSessao {
    private int data;
    private int horario;
    private int numIngresso;
    private int ingressoVendido;
    Filme filme;
    Sala sala;

    public CinemaSessao(int data, int horario, Filme filme, Sala sala) {
        this.data = data;
        this.horario = horario;
        this.numIngresso = sala.getCapMaxima();
        this.ingressoVendido = 0;
        this.filme = filme;
        this.sala = sala;
    }
    public void venderIngresso(int qtde){
        if(qtde <= numIngresso){
            numIngresso -= qtde;
            ingressoVendido += qtde;
        }else System.out.println("quantidade nao disponivel");
    }
    public void exibirRelatorio() {
        System.out.println("Data da Sessão: " + data);
        System.out.println("Horário da Sessão: " + horario);
        System.out.println("Total de Ingressos Vendidos: " + ingressoVendido);
        System.out.println("Número da Sala: " + sala.getNumSala());
        System.out.println("Título do Filme: " + filme.getNome());
        System.out.println("Duração do Filme: " + filme.getDuracao() + " minutos");
    }
}
