public class Locadora {
    private String marca;
    private String modelo;
    private String placa;
    private int valoDiaria;
    private boolean isAlugado = false;
    private String nomeCliente;
    private int dataL;
    private int dataD;
    public Locadora(String marca, String modelo, String placa, int diaria) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.valoDiaria = diaria;

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getValoDiaria() {
        return valoDiaria;
    }

    public boolean isAlugado() {
        return isAlugado;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setValoDiaria(int valoDiaria) {
        this.valoDiaria = valoDiaria;
    }

    public void setAlugado(boolean alugado) {
        isAlugado = alugado;
    }

    public int aluga(String nomeCliente, int data){
        this.nomeCliente = nomeCliente;
        this.dataL = data;

        if(isAlugado == true){
            System.out.println("Carro ja esta alugado");
        }else {
            isAlugado = true;
            System.out.println("veiculo alugado");
        }
        return dataL;

    }
    public int devolver(int dataD){
        isAlugado = false;
        this.dataD = dataD;
        System.out.println("veiculo devolvido");
        return dataD;
    }
    public int dias(){
        int total = dataD - dataL + 1;
        System.out.println("Dias Locados : " +total);
        return total;
    }

    @Override
    public String toString() {
        if (isAlugado == true) {
            return "\nLocadora" +
                    "\nmarca='" + marca + '\'' +
                    "\nmodelo='" + modelo + '\'' +
                    "\nplaca='" + placa + '\'' +
                    "\nvaloDiaria=" + valoDiaria +
                    "\nisAlugado=" + isAlugado +
                    "\ncliente=" + nomeCliente +
                    "\nData locacao :"  + dataL;
        }else {
            return "Locadora{" +
                    "\nmarca='" + marca + '\'' +
                    "\nmodelo='" + modelo + '\'' +
                    "\nplaca='" + placa + '\'' +
                    "\nvaloDiaria=" + valoDiaria +
                    "\nAlugado=" + isAlugado;
        }
    }
}
