package unpocodetodo;

public class Mates {
    
    public static double suma(double n1, double n2) {
        return n1 + n2;
    }
    public static double resta(double n1, double n2) {
        return n1 - n2;
    }
    public static double multiplicacion(double n1, double n2) {
        return n1 * n2;
    }
    public static double division(double n1, double n2) {
        return n1 / n2;
    }
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("Suma de 5+5= " + suma(5,5));
        System.out.println("==============================");
        System.out.println("Resta de 5-5= " + resta (5,5));
        System.out.println("==============================");
        System.out.println("Multiplicacion de 5x5= " + multiplicacion(5,5));
        System.out.println("==============================");
        System.out.println("Division de 5/5= " + division(5,5));
        System.out.println("==============================");
    }

}
