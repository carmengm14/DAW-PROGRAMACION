import java.util.Scanner;

public class Ejer25 {
    public static void main(String[] args) {
        
        double num = 1;
        double resultado = 1;

        System.out.print("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();

        while ( num != 0){
            resultado = resultado * num;
            num --;  
        }
        
        System.out.println("Tus posibilidades son de: " + resultado);
        
        sc.close();
    }
}
