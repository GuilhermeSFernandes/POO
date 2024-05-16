package EX4;

import java.util.ArrayList;
import java.util.List;

public class Vaga {
    private int numVaga;
    private List<Veiculo> veiculos;
    private boolean isDisponivel;
    private double horaI;

    public Vaga(int numVaga){
        this.numVaga = numVaga;
        this.veiculos = new ArrayList<>(1);
        isDisponivel = true;
    }
    public boolean isDisponivel(){
        return isDisponivel;
    }
    public void addVeiculo(Veiculo veiculo, double horaI){
        if(!isDisponivel){
            System.out.println("Vaga ja esta ocupada\n");
        }else {
            this.veiculos.add(veiculo);
            this.horaI = horaI;
            isDisponivel = false;
        }
    }
    private double taxa(double horaF){
        double tax = 2.0;
        double horaP = horaF - horaI;
        if(horaP > 3){
            tax += (horaP - 3) * 0.5;
        }
        return tax;
    }
    public void removeVeiculo(Veiculo veiculo, double horaF){
                if(veiculos.remove(veiculo)){
                    double taxa = taxa(horaF);
                    System.out.println("Veículo " + veiculo.getPlaca() + " retirado da vaga " + numVaga);
                    System.out.println("Taxa de permanência: R$ " + taxa);
                    isDisponivel = true;
                }else System.out.println("Veiculo nao encontrado");
    }
    public void info(){
        System.out.println("Vaga " + numVaga + ":");
        if (isDisponivel) {
            System.out.println("Esta vaga está disponível.");
        } else {
            System.out.println("Veículo estacionado: " + veiculos.get(0).getPlaca());
        }
    }
}
