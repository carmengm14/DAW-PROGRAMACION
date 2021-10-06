import java.util.Scanner;

public class Ejer19 {
    public static void main(String[] args) {
        
        System.out.print("Escribe tu salario bruto por hora: ");
        Scanner sc = new Scanner (System.in);
        float salario = sc.nextFloat();

        System.out.print("Escribe el numero de horas que haces a la semana:");
        float horas = sc.nextFloat();

        if (horas <= 35) {
            System.out.println("Tu salario bruto mensual es de: " + (salario * horas)*4 + "€");
        } else {
            System.out.println("Tu salario bruto mensual es de: " + ((salario * 1.5) * horas) * 4 + "€" );
        }

     //   if (salario <= 500) {
     //       System.out.println("No tienes impuestos por lo tanto tu salario al mes es de: " + (salario * horas) + "€");
     //   } else if (salario > 500 || salario < 900 ) {
     //       System.out.println("Tus impuestos son de: " + (salario * 25)/100 + "€");
     //       System.out.println("Por lo tanto tu salario al mes, se queda en: " + salario + "€");
     //   } else {
     //       System.out.println("Tus impuestos son de: " + (salario * 45)/100 + "€");
     //       System.out.println("Por lo tanto tu salario al mes, se queda en: " + salario + "€");
     //   }


       sc.close();

    }
}