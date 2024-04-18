public class calculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora("Motorola", "Basica", 90);
        System.out.println(calc);
        int soma = calc.soma(1, 1);
        int div = calc.divisao(4,2);
        int mult = calc.multiplicacao(2,2);
        int sub  = calc.subtracao(2,1);
        System.out.println(soma);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mult);
    }
}
