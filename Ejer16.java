import java.util.Scanner;

public class Ejer16 {
    public static void main(String args[]){
    
        System.out.println("Escibe un numero entero: ");
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();

        System.out.println("Escribe otro numero entero: ");
        int n2 = sc.nextInt();

        System.out.println("¿Que tipo de operación quieres?, tus opciones son suma, resta, multiplicación y division (escribe solo el símbolo): ");
        int respuesta = sc.nextInt();

        int suma = (n1 + n2);
        int resta = (n1 - n2);
        int multiplicacion = (n1 * n2);
        int division = (n1 / n2); 

        switch (respuesta) {
            case 1:
                System.out.printl("Tu suma es de: " + suma);
                break;
            case 2: 
                System.out.printl("Tu resta es de: " + resta);
                break;
            case 3:
                System.out.printl("Tu multiplicacion es de: " + multiplicacion);
                break;
            case 4:
                System.out.printl("Tu division es de: " + division);
                break;
            default:
                System.out.println("No has colocado bien el simbolo, vuelve a intentarlo");
                break;
        }
    }
}
