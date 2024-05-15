package Ex2;

public class Livro {
    private String autor;
    private String titulo;
    private int anoPublicacao;
    private String editora;
    private int totalPagina;
    private boolean status;
    private int diaEmprestimo;

    public Livro(String autor, String titulo, int anoPublicacao, String editora, int totalPagina) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.totalPagina = totalPagina;
        this.status = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return status;
    }

    public void emprestar(int diaEmprestimo) {
        if (status) {
            this.diaEmprestimo = diaEmprestimo;
            status = false;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    public void devolver(int diaDevolucao) {
        if (!status) {
            if (diaDevolucao >= diaEmprestimo) { // Verifica se a data de devolução é válida
                int diasAtraso = diaDevolucao - (diaEmprestimo + 7);
                if (diasAtraso > 0) {
                    double multa = diasAtraso * 1.5;
                    System.out.println("Multa gerada de R$" + multa + " devido ao atraso na devolução.");
                }
                status = true;
                System.out.println("Livro devolvido com sucesso.");
            } else {
                System.out.println("Data de devolução inválida.");
            }
        } else {
            System.out.println("Livro já está disponível na biblioteca.");
        }
    }
}
