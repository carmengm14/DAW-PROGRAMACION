import java.util.Scanner;

public class Control01 {
    public static void main(String[] args) {
        
        System.out.print("Dime el numero de lados del poligono: ");
        Scanner sc = new Scanner(System.in);
        int numlados = sc.nextInt();

        if (numlados == 3 || numlados == 4) {
            System.out.print("Dime la longitud del lado del poligono: ");
            double longitud = sc.nextDouble();

           if (numlados == 3) {
            System.out.println("El perimetro del triangulo es: " + numlados * longitud);
           } else {
            System.out.println("El perimetro del cuadrado es: " + numlados * longitud);
           }

        } else {
            System.out.println("NO PUEDES CONTINUAR");
        }
        sc.close();
    }    
}
