package tema2.actividades;
import java.util.Scanner;
/* MayorDeTres.java Escribe un programa que pida tres números e imprima el mayor de los tres*/
public class MayorDeTres {
    public static void MayorDeTresNumeros(int[] numeros) {

            if (numeros[0] > numeros[1] && numeros[0] > numeros[2]) {
                System.out.println("El mayor numero es = " + numeros[0]);

            }else if (numeros[1] > numeros[0] && numeros[1] > numeros[2]){
                System.out.println("El mayor numero es = " + numeros[1]);

            }else if (numeros[2] > numeros[0] && numeros[2] > numeros[1]){
                System.out.println("El mayor numero es = " + numeros[2]);
            }
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int [] nums = new int [3];
        for (int contador = 0; contador < nums.length; contador++) {
            System.out.print("Dime un numero: ");
            nums[contador] = sc.nextInt();
        }
        MayorDeTresNumeros(nums);
        sc.close();
   } 
}