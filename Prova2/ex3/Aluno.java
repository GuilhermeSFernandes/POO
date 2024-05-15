package ex3;

public class Aluno {
    private int RA;
    private String nome;
    private double n1;
    private double n2;
    private double n3;
    private double n4;
    private double media;
    private boolean status;

    public Aluno(int RA, String Nome, double n1, double n2, double n3, double n4) {
        this.RA = RA;
        this.nome = Nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.status = true;
        this.calcMedia();
    }

    public void calcMedia() {
        this.media = (n1 + n2 + n3 + n4) / 4;

    }
    public void isAprovado(){
        if(media >= 6){
            status = true;
            System.out.println("Aprovado");
        }else{
            status = false;
            System.out.println("Reprovado");
        }
    }

    public double getMedia() {
        return media;
    }
    public String getNome(){
        return nome;
    }
    public int getRA(){
        return RA;
    }
}
