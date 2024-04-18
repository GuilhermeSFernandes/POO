public class Funcionario {
    int numRegistro;
    String nome;
    int dataNascimento;
    String sexo;
    String setor;
    int telefone;
    String endereco;
    public Funcionario (int numRegistro, String nome, int dataNascimento, String sexo, String setor, int telefone, Endereco endereco){
        this.numRegistro = numRegistro;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.telefone = telefone;
        this.endereco = String.valueOf(endereco);
    }
    public void Cadastrar(){
        System.out.println("Funcionario Cadastrado");
    }
    public void emitirRelatorio(){
        System.out.println("Número de Registro: " + numRegistro);
        System.out.println("Nome Completo: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Setor: " + setor);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco.toString());
    }
}
