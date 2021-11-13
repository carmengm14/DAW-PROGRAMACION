package ESTRUCTURASCONDICIONALES;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*Escriba un programa que entregue la edad del usuario a partir de su fecha de nacimiento: */
public class Edad {
    public static void main(String[] args) {
        System.out.println("Ingese su fecha de nacimiento.");
        System.out.print("Dia:");
        Scanner sc = new Scanner(System.in);
        int dia= sc.nextInt();

        System.out.print("Mes:");
        int mes= sc.nextInt();

        System.out.print("Anno:");
        int anno= sc.nextInt();
        sc.close();

        Calendar fechaNacimiento = new GregorianCalendar(anno, dia, mes);
        Calendar ahora = Calendar.getInstance(); //Calendar.getInstance() obtiene la instacia que le pasemos por parametro o la de por defecto.

        long edadEnDias = (ahora.getTimeInMillis()- fechaNacimiento.getTimeInMillis()) / 1000 / 60 / 60 / 24;; 
        //.getTimeInMillis devuelve los años en días osea 18 años 6570 días.

        int anos = Double.valueOf(edadEnDias / 365.25).intValue(); //intValue() devuelve el primitivo int

        System.out.println(String.format("Usted tiene " + anos + " annos"));

       /* Period edad = Period.between(LocalDate.of(dia,mes,anno), LocalDate.now());
        System.out.println(edad);*/
    }
}
