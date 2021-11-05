import java.util.Scanner;
public class E09 {
    public static void main(String[] args) {
        System.out.print("Ingrese nota certamen 1: ");
        Scanner sc = new Scanner(System.in);
        double certamen1 = sc.nextDouble();

        System.out.print("Ingrese nota certamen 2: ");
        double certamen2 = sc.nextDouble();

        System.out.print("Ingrese nota laboratorio: ");
        double notalab = sc.nextDouble();
        sc.close();
        

     double calculo1 = 60-(notalab*0.3)/0.7;
     double calculo2 = (calculo1 * 3) - (certamen1+certamen2);
     System.out.println("Necesita nota " + calculo2 + " en el certamen 3");
    }
}

