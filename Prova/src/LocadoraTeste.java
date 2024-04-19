public class LocadoraTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente ("Gui");
        Locadora l = new Locadora("Volks", "Gol", "ABC123", 120);
        System.out.println(l);
        l.aluga("gui", 12);
        l.devolver(14);
        l.dias();
        l.aluga("gui", 14);
        System.out.println(l);
    }
}
