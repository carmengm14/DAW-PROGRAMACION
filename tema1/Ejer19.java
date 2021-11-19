import java.util.Scanner;

public class Ejer19 {
    public static void main(String[] args) {
        
        System.out.print("Escribe tu salario bruto por hora: ");
        Scanner sc = new Scanner (System.in);
        float salario = sc.nextFloat();

        System.out.print("Escribe el numero de horas que haces a la semana: ");
        float horas = sc.nextFloat();

        float salariobajo = (salario * horas ) * 4;
        float salarioalto = ((salario * horas) * 4);

        float impuestoalto25 = (salarioalto * 25)/100;
        float impuestoalto45 = (salarioalto * 45)/100;
        float impuestobajo25 = (salariobajo * 25)/100;
        float impuestobajo45 = (salariobajo * 45)/100;


        if (horas <= 35) {
            System.out.println("Tu salario bruto mensual es de: " + salariobajo + "€");
            if (salariobajo <= 500) {
                       System.out.println("No tienes impuestos por lo tanto tu salario al mes es de: " + salariobajo + "€");
                   } else if (salariobajo > 500 || salariobajo < 900 ) {
                       System.out.println("Tus impuestos son de: " + impuestobajo25 + "€");
                       System.out.println("Por lo tanto tu salario al mes, se queda en: " + (salariobajo - impuestobajo25 ) + "€");
                   } else {
                       System.out.println("Tus impuestos son de: " + impuestobajo45 + "€");
                       System.out.println("Por lo tanto tu salario al mes, se queda en: " + (salariobajo - impuestobajo45 ) + "€");
                   }
        } else {
            System.out.println("Tu salario bruto mensual es de: " + salarioalto + "€" );
        }

        if (salarioalto <= 500) {
            System.out.println("No tienes impuestos por lo tanto tu salario al mes es de: " + salarioalto + "€");
        } else if (salarioalto > 500 || salarioalto < 900 ) {
            System.out.println("Tus impuestos son de: " + impuestoalto25 + "€");
            System.out.println("Por lo tanto tu salario al mes, se queda en: " + (salarioalto - impuestoalto25 ) + "€");
        } else {
           System.out.println("Tus impuestos son de: " + impuestoalto45 + "€");
            System.out.println("Por lo tanto tu salario al mes, se queda en: " + (salarioalto - impuestoalto45 ) + "€");
        }


       sc.close();

    }
}