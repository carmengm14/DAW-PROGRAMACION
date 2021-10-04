import java.util.Scanner;

public class Ejer9 {
    public static void main(String args[]) {
        System.out.print("¿Cúantos años tienes?: ");
        Scanner sc = new Scanner (System.in);
        int edad = sc.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad ya que tienes: " + edad);
        }else{
            System.out.println("Eres menor de edad ya que tienes: " + edad);
        }
        
        sc.close();
    }
}
