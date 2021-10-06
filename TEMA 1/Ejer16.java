import java.util.Scanner;

public class Ejer16 {
    public static void main(String args[]){
        System.out.print("Escibe un numero entero: ");
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();

        System.out.print("Escribe otro numero entero: ");
        int n2 = sc.nextInt();

        System.out.print("Que tipo de operacion quieres?, tus opciones son suma, resta, multiplicacion y division (escribe solo el simbolo): ");
        String respuesta = sc.next();

        switch (respuesta) {
            case "+":
                System.out.println("Tu suma es de: " + (n1 + n2));
                break;
            case "-": 
                System.out.println("Tu resta es de: " + (n1 - n2));
                break;
            case "*":
                System.out.println("Tu multiplicacion es de: " + (n1 * n2));
                break;
            case "/":
                System.out.println("Tu division es de: " + (n1 / n2));
                break;
            default:
                System.out.println("No has colocado bien el símbolo, vuelve a intentarlo");
                break;
        }
        sc.close();
    }
}