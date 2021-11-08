import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
    
        System.out.print("Ingrese numero: ");
        Scanner sc = new Scanner (System.in);
        String numero = sc.next();
        sc.close();
        System.out.println(numero.charAt(2) + "" + numero.charAt(1) + "" + numero.charAt(0));
        
        
        /* String numero = sc.next();
        sc.close();
        char[] aux = new char[numero.length()];
        
 
        int tamanyo = numero.length();
        for (int i = 0; i <= tamanyo/2; i++) {
            char caracter1 = numero.charAt(i);
            char caracter2 = numero.charAt(tamanyo-i-1);
            aux[i] = caracter2;
            aux[tamanyo-i-1] = caracter1;
        }

        for(int i=0; i<aux.length;i++){
          System.out.print(aux[i]);
        }
        System.out.println();
        */
      }
    }