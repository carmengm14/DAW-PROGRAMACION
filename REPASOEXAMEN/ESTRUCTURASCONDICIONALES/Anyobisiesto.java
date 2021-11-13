package ESTRUCTURASCONDICIONALES;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*Cuando la Tierra completa una órbita alrededor del Sol, no han transcurrido exactamente 365 rotaciones sobre sí misma, sino 
un poco más. Más precisamente, la diferencia es de más o menos un cuarto de día. Para evitar que las estaciones se desfasen con el calendario, 
el calendario juliano introdujo la regla de introducir un día adicional en los años divisibles por 4 (llamados bisiestos), para tomar 
en consideración los cuatro cuartos de día acumulados. Sin embargo, bajo esta regla sigue habiendo un desfase, que es de aproximadamente 3/400 de día.
Para corregir este desfase, en el año 1582 el papa Gregorio XIII introdujo un nuevo calendario, en el que el último año de cada siglo dejaba de 
ser bisiesto, a no ser que fuera divisible por 400. Escriba un programa que indique si un año es bisiesto o no, teniendo en cuenta cuál era el 
calendario vigente en ese año:*/

public class Anyobisiesto {
    public static void main(String[] args) {
        System.out.print("Ingrese un anno:");
        Scanner sc = new Scanner(System.in);
        int anno = sc.nextInt();
        sc.close();
      /* if ( ( ( anno % 4 == 0 ) && ( anno % 100 != 0 ) ) || ( anno % 400 == 0 ) ){
            System.out.println(anno + " es bisiesto");
        } else {
            System.out.println(anno + " no es bisiesto");
        }*/

        GregorianCalendar calendar= new GregorianCalendar();
        if (calendar.isLeapYear(anno)) {
            System.out.println("El anno es bisiesto");
        } else {
            System.out.println("El anno no es bisiesto");
        }

    }
}
