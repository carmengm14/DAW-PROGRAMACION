import java.util.Scanner;
/*. Nota.java Realiza un programa que lea un valor numérico entero correspondiente a la nota de un
examen y muestre su valor en letra:
de 0 a 3 Muy Deficiente.
de 3 a 5 Insuficiente.
de 5 a 6 Suficiente.
de 6 a 7 Bien
de 7 a 9 Notable
de 9 a 10 Sobresaliente
*/
public class Nota {

    public static void Notaexamen(int nota) {
        switch (nota) {
            case 0: case 1: case 2:
                System.out.println(nota + " = Muy Deficiente.");
                break;
            case 3: case 4: 
                System.out.println(nota + " = Insuficiente.");
                break;
            case 5:
                System.out.println(nota + " = Suficiente.");
                break;
            case 6: 
                System.out.println(nota + " = Bien.");
                break;
            case 7: case 8: 
                System.out.println(nota + " = Notable.");
                break;
            case 9: case 10: 
                System.out.println(nota + " = Sobresaliente.");
                break;
            default:
                System.out.println("NO ES UNA NOTA PERMITIDA");
                break;
        }
    }
    public static void main(String[] args) {
        System.out.print("Dime la nota de tu examen: ");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        sc.close();
        Notaexamen(nota);
    }
}
