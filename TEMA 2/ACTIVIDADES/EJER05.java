package ACTIVIDADES;
import java.util.Scanner;

/* LetraDni.java  Realiza un método llamado  letraDni  que devuelva la letra correspondiente a un DNI
sin letra */
public class EJER05 {
    public static void letraDNI(int dni){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int operacion = dni % 23;
        System.out.println("Tu DNI completo es: " + dni + letras[operacion]);
    }
    public static void main(String[] args) {
        System.out.print("Introduce el numero de tu DNI sin letra: ");
        Scanner sc = new Scanner(System.in);
        int dni = sc.nextInt(); 
        letraDNI(dni);
        sc.close();

    }
}
