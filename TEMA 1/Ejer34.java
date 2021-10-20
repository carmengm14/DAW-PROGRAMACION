import java.util.Scanner;

public class Ejer34 {
    public static void main(String[] args) {
        System.out.print("Escribe los numeros de tu NIE sin la letra: ");
        Scanner sc = new Scanner(System.in);
        int nie = sc.nextInt();
        sc.close();
        
        String letras = "XTZ";
        letras.charAt(nie % 23 + 1);
        System.out.println(letras);

    }
    
}
