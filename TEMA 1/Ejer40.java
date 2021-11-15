
/*FIBONACCI Diseña un programa que muestre los primeros 40 términos de la serie de Fibonacci
Este programa utiliza una técnica usada mucho en programación que se denomina swap y que 
consiste en intercambiar el valor de dos variables usando una variable auxiliar. */
public class Ejer40 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        System.out.print("1, 1");
        for (int i = 3; i <= 40; i++) {
            int suma = n1 + n2;
            System.out.print(", " + suma);
            n1 = n2;
            n2 = suma;
        }
        System.out.println(" ");
    }
}
