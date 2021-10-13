import java.util.Scanner;

public class Ejer21 {
    public static void main(String[] args) {
        
        System.out.print("Que año te intera saber si es bisesto o no?: ");
        Scanner sc = new Scanner(System.in);
        int año = sc.nextInt();

        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))){
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }

 sc.close();       
    }
}
