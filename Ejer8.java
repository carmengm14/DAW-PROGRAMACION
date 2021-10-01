import java.util.Scanner;
    
    public class Ejer8 {
        public static void main(String[] args) {

            System.out.print("¿Cuántos años tienes?: ");
            java.util.Scanner sc = new Scanner (System.in);
            int edad = sc.nextInt();

            if (edad >= 18){
                System.out.println("Eres mayor de edad");
            }
            sc.close();
        }
    
}