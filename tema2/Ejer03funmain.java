import java.util.Scanner;
public class Ejer03funmain {
    public static void NEWLine(double s) {
        System.out.println(s);
    }
    public static void threeLine(double s) {
        NEWLine(s);
        NEWLine(s);
        NEWLine(s);
    }
    public static void nLines(double s) {
        if (s > 0) {
            System.out.println(s);
            nLines(s - 1);
        }else{
            System.out.println("S'ACABAO PACO");
        }
    }
    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        sc.close();
        NEWLine(s);
        System.out.println("====");
        threeLine(s);
        System.out.println("====");
        nLines(s);
    }
}
