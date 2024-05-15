package Ex2;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando alguns livros à biblioteca
        biblioteca.addLivro("Dom Quixote", "Miguel de Cervantes", 1605, "Editora A", 200);
        biblioteca.addLivro("1984", "George Orwell", 1949, "Editora B", 300);
        biblioteca.addLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, "Editora C", 150);

        // Verificando a disponibilidade de um livro
        biblioteca.verificarDisponibilidade("1984");

        // Emprestando um livro
        biblioteca.emprestaLivro("1984", 5);

        // Verificando a disponibilidade do mesmo livro após o empréstimo
        biblioteca.verificarDisponibilidade("1984");

        // Devolvendo o livro
        biblioteca.devolver("1984", 12);

        // Verificando a disponibilidade do livro após a devolução
        biblioteca.verificarDisponibilidade("1984");
    }
}
