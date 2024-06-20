package Ex1;

public class AlunoTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Gui", "Botucatu", 5509L, 46619L);
        p.exibirInformacoes();
        Aluno aluno = new Aluno("Maria Oliveira", "15/05/1995", 98765432L, 123456789L, 1001);
        aluno.exibirInformacoes();
    }
}
