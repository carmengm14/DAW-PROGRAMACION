import java.util.Scanner;

public class Ejer17 {
    public static void main(String args[]){
        System.out.print("Escibe el numero mes del que quieres saber sus días: ");
        Scanner sc = new Scanner (System.in);
        int mes = sc.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("El mes tiene: 31 dias");
                break;
            case 2: 
                System.out.println("El mes tiene: 28 dias");
                break;
            case 4:
            case 6:
            case 8:  
            case 10:  
            case 12:
                System.out.println("El mes tiene: 30 dias");
                break;
            default:
                System.out.println("No has escrito un mes valido, vuelve a intentarlo");
                break;
        }
        sc.close();
    }
}
