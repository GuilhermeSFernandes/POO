package ex3;

public class TurmaTeste {
    public static void main(String[] args) {
        Aluno a = new Aluno(2304, "Gui", 10,2,3,4);
        Aluno b = new Aluno(2304, "Gu", 0,2,3,4);
        Aluno c = new Aluno(2304, "Jon", 10,2,3,4);
        Aluno d = new Aluno(2304, "Gabe", 0,2,3,4);
        Aluno e = new Aluno(2304, "Optimus", 10,2,3,4);
        Aluno f = new Aluno(2304, "Rafa", 10,10,10,10);
        Turma t = new Turma("T1");
        t.addAluno(a);
        t.addAluno(b);
        t.addAluno(c);
        t.addAluno(d);
        t.calcMedia();
    }
}
