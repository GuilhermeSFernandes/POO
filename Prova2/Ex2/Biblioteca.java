package Ex2;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void addLivro(String titulo, String autor, int anoPublicacao, String editora, int numPagina) {
        Livro livro = new Livro(autor, titulo, anoPublicacao, editora, numPagina); // Correção aqui
        this.livros.add(livro);
    }

    public void verificarDisponibilidade(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().toLowerCase().equals(titulo.toLowerCase())) { // Modificação aqui
                if (livro.isDisponivel()) {
                    System.out.println("Livro: " + titulo + " está disponível");
                    return;
                } else {
                    System.out.println("Livro não está disponível");
                    return;
                }
            }
        }
        System.out.println("Livro não encontrado");
    }

    public void emprestaLivro(String titulo, int data) {
        for (Livro livro : livros) {
            if (livro.getTitulo().toLowerCase().equals(titulo.toLowerCase())) { // Modificação aqui
                livro.emprestar(data);
                return;
            }
        }
        System.out.println("Livro não encontrado");
    }

    public void devolver(String titulo, int data) {
        for (Livro livro : livros) {
            if (livro.getTitulo().toLowerCase().equals(titulo.toLowerCase())) { // Modificação aqui
                livro.devolver(data);
                return;
            }
        }
        System.out.println("Livro não encontrado");
    }
}
