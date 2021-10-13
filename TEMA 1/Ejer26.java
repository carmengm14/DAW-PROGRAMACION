import java.util.Scanner;


public class Ejer26 {
    public static void main(String[] args) {
        
        int multiplicacion = 1;
        int resultado ;

        System.out.print("Escribe el numero del que quieres saber la tabla de multiplicar: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num >= 0 && multiplicacion <= 10){
            resultado = num * multiplicacion;
            System.out.println("Resultado es de: " + resultado);
            multiplicacion ++;
        }

    }
}
