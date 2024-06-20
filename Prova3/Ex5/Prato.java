package Ex5;

public class Prato {
    protected int numero;
    protected String nome;
    protected String ingredientes;
    protected int precoUnitario;

    public Prato(int numero, String nome, String ingredientes, int precoUnitario) {
        this.numero = numero;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.precoUnitario = precoUnitario;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public int getPrecoUnitario() {
        return precoUnitario;
    }
}
