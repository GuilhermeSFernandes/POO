package Ex3;

public class TesteGeral {
    public static void main(String[] args) {
        Colaborador c = new Colaborador("jj", "jj", "ss");
        System.out.println(c);
        Funcionario f = new Funcionario("Gui", "kk", "2002", "Jogador", 999);
        System.out.println(f);
        Empregado e = new Empregado("ui", "pp","90", "poper", 800, 77);
        System.out.println(e);
        Estagiario estagiario = new Estagiario("kkkk", "qq", "332", "Estagio", 222, 3333);
        System.out.println(estagiario);
        Prestador p = new Prestador("opo", "ppppppp", "000", 90, "entrega");
        System.out.println(p);
        Empresa empresa = new Empresa("lll", "dhfufgiusd", "88", 66, "eirigntidkofs", 9999090);
        System.out.println(empresa);
        Autonomo autonomo = new Autonomo("fjdshbgjds", "fhnewsjfhdj", "fojweijfiods", 9, "fhndfjs", 432423);
        System.out.println(autonomo);
    }
}
