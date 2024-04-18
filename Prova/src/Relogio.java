public class Relogio {
    private String marca;
    public int hora;
    public int minuto;
    public Relogio (String marca, int hora , int minuto){
        this.marca = marca;
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getHora() {
        return hora;
    }

    public String getMarca() {
        return marca;
    }

    public void setHora(int hora) {
        if(hora >= 0 && hora <= 23){
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto <= 59){
            this.minuto = minuto;
        }
    }
    public void horaAgora(){
        System.out.println("Hora : " + hora + ":" + minuto + "\nMarca:" + marca);
    }
}
