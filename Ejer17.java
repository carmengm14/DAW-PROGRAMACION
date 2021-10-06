import java.util.Scanner;

public class Ejer17 {
    public static void main(String args[]){
        System.out.print("Escibe el numero mes del que quieres saber sus días: ");
        Scanner sc = new Scanner (System.in);
        int mes = sc.nextInt();

        switch (mes) {
            case 1:
                System.out.println("El mes de Enero tiene: 31 dias");
                break;
            case 2: 
                System.out.println("El mes de Febrero tiene: 28 dias");
                break;
            case 3:
                System.out.println("El mes de Marzo tiene: 31 dias");
                break;
            case 4:
                System.out.println("El mes de Abril tiene: 30 dias");
                break;
            case 5:
                System.out.println("El mes de Mayo tiene: 31 dias");
                break;
            case 6:
                System.out.println("El mes de Junio tiene: 30 dias");
                break;
            case 7:
                System.out.println("El mes de Julio tiene: 31 dias");
                break;
            case 8:
                System.out.println("El mes de Agosto tiene: 30 dias");
                break;
            case 9:
                System.out.println("El mes de Septiembre tiene: 31 dias");
                break;
            case 10:
                System.out.println("El mes de Octubre tiene: 30 dias");
                break;
            case 11:
                System.out.println("El mes de Noviembre tiene: 31 dias");
                break;
            case 12:
                System.out.println("El mes de Diciembre tiene: 30 dias");
                break;
            default:
                System.out.println("No has escrito un mes valido, vuelve a intentarlo");
                break;
        }
    }
}
