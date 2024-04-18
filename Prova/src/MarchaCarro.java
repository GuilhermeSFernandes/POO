public class MarchaCarro {
    private int velocidade;
    public MarchaCarro(){
        this.velocidade = 0;
    }
    public int getVelocidade() {
        return velocidade;
    }

    public int acelerar(){
        System.out.println("Velocidade:" + velocidade);
        marcha();
        if(velocidade <= 130){
            velocidade += 5;
            System.out.println("Acelerando");
            System.out.println("Velocidade:" + velocidade);
            marcha();
        }else System.out.println("Velociade maxima atingida");
        return velocidade;
    }
    public int freiar(){
        System.out.println("Velocidade:" + velocidade);
        if(velocidade > 0){
            velocidade -= 5;
            System.out.println("Freiando");
            System.out.println("Velocidade:" + velocidade);
            marcha();
        }else System.out.println("Carro ja esta parado");
        return velocidade;
    }
    private void marcha(){
        if(velocidade == 0){
            System.out.println("Neutro");
        }else if(velocidade >= 1 && velocidade <= 19){
            System.out.println("1 marcha");
        }else if(velocidade >= 20 && velocidade <= 39){
            System.out.println("2 marcha");
        }else if (velocidade >= 40 && velocidade <= 59){
            System.out.println("3 marcha");
        }else if (velocidade >= 60 && velocidade <= 89){
            System.out.println("4 marcha");
        }else System.out.println("5 marcha");
    }
}
