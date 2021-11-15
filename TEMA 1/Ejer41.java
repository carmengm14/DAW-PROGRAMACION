/* Modifica el programa anterior para que muestre la relación (división) entre el valor n y
el (n - 1) de la serie de Fibonacci. Esta es una manera de obtener una aproximación 
al Número Áureo.*/

/**NUMERO AUREO */

public class Ejer41 {
    public static void main(String[] args) {
        double n1 = 1;
        double n2 = 1;
        System.out.print("1, 1");
        for (int i = 3; i <= 40; i++) {
            double suma = n1+n2;
            n1 = n2;
            n2 = suma;
            System.out.print(", " + n2/n1);
        }
        System.out.println(" ");
    }
}
