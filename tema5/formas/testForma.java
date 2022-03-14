public class testForma {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo("Verde", 3, 5, "Rectangulo 1", 3, 5);
        r.mover(2, 6);
        r.cambiarTamaño(2);

        Elipse e = new Elipse("Rojo", 5, 6, "Elipse 1", 3, 2);

        r.imprimir();
        System.out.println("===========");
        e.imprimir();
    }
}
