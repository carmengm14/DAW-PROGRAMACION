/*Escriba un programa que simule una calculadora básica, este puede realizar operación de suma, resta, multiplicación y división.
El programa debe recibir como entrada 2 números reales y un operador, que puede ser +, -, * o /.
La salida del programa debe ser el resultado de la operación.*/
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.print("Operando: ");
        Scanner sc = new Scanner(System.in);
        int operando1 = sc.nextInt();
        double operando3 = operando1;

        System.out.print("Operador: ");
        String operador = sc.next();

        System.out.print("Operando: ");
        int operando2 = sc.nextInt();
        double operando4 = operando2;
        sc.close();

        int suma = operando1 + operando2;
        int resta = operando1 - operando2;
        int multiplicacion = operando1 * operando2;
        double division = operando3/operando4;
        double elevado = Math.pow(operando3, operando4);
       /* int i = 1 ;
        while (operando4 < i) {
            double elevado = operando3 * operando4;
            i++;
        } */
        switch (operador) {
            case "+":
                System.out.println(operando1 + " + " + operando2 + " = " + suma);
                break;
            case "-":
                System.out.println(operando1 + " - " + operando2 + " = " + resta);
                break;
            case "*":
                System.out.println(operando1 + " * " + operando2 + " = " + multiplicacion);
                break;
            case "/":
                System.out.println(operando1 + " / " + operando2 + " = " + division);
                break;
            case "**":
                System.out.println(operando1 + " ** " + operando2 + " = " + elevado);
                break;
            default:
            System.out.println("No existe");
                break;
        }

    }
}
