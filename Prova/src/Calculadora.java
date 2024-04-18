public class Calculadora {
    private String modelo;
    private String tipo;
    private int memoriaInterna;

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getMemoriaInterna() {
        return memoriaInterna;
    }

    public Calculadora(String modelo, String tipo, int memoriaInterna){
        this.modelo = modelo;
        this.tipo = tipo;
        this.memoriaInterna = memoriaInterna;

    }
    public int soma(int a, int b) {
        return a + b;
    }
    public int subtracao(int a , int b){
        return a - b;
    }
    public int multiplicacao(int a, int b){
        return a * b;

    }
    public int divisao(int a, int b){
        return a/b;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", memoriaInterna=" + memoriaInterna +
                '}';
    }
}
