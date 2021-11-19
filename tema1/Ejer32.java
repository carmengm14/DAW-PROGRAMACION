import java.util.Scanner;

public class Ejer32 {
    public static void main(String[] args) {
    
        int[] nums = new int[10];
        int i;
        Scanner sc = new Scanner (System.in);
        System.out.println("Por favor, introduzca 10 números enteros.");
        System.out.println("Pulse la tecla INTRO después de introducir cada número.");
        sc.close();

        for (i = 0; i < 10; i++) {
          nums[i] = Integer.parseInt(System.console().readLine());
        }
        
        System.out.println("Los números introducidos, al revés, son los siguientes:");
        for (i = 9; i >= 0; i--) {
          System.out.println(nums[i]);
        }
      }
    }
