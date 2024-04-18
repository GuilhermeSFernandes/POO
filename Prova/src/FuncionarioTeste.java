public class FuncionarioTeste {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", 123, "Centro", "Ponta Grossa", "PR");
        Funcionario funcionario1 = new Funcionario(2304325, "Guilherme Fernandes", 30072002, "Maculino", "TI", 14998559, endereco1 );
        funcionario1.Cadastrar();
        funcionario1.emitirRelatorio();
    }
}
