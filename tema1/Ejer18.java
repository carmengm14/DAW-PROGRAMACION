import java.util.Scanner;

public class Ejer18 {
    public static void main(String[] args) {
        
        System.out.print("Escribe las horas en formato hh: ");
        Scanner sc = new Scanner (System.in);
        Byte horas = sc.nextByte();

        System.out.print("Escribe los minutos en formato mm: ");
        Byte minutos = sc.nextByte();

        System.out.print("Escribe los segundos en formato ss: ");
        Byte segundos = sc.nextByte();
        

        if (segundos >= 59) {
            segundos = 00;
            minutos ++;
        } else {
            segundos ++;
        }
        if (minutos >=59) {
            minutos = 00;
            horas ++;
        } else {
            minutos ++;
        }

        if (horas >=23) {
            horas = 00;
        } 


       // if (minutos >= 60 ) {
       //     minutos = 00;
       // } else {
        //    minutos ++;
      //  }
      if (segundos > 60) {
        System.out.println("Este numero no esta permitido");
     } else if (minutos > 60) {
        System.out.println("Este numero no esta permitido");
     }  else if (horas > 24) {
        System.out.println("Este numero no esta permitido");
       }  else {
        System.out.println(horas + ":" + minutos + ":" + segundos );
       }
        
        //if (horas >= 24) {
         //   horas = 00;
        //} else {
          //  horas ++;
       // }  

        
        sc.close();
    }
    
}
 