package practica;

import java.util.Scanner;

public class UsuarioInput {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Escribe: \n1- Crear Usuario \n0- Salir \n=============");
     int respuesta = sc.nextInt();
     
     if (respuesta == 1) {
         System.out.print("Escribe tu email: ");
         String email = sc.next();
         System.out.print("Escribe una contraseña: ");
         String contraseña = sc.next();
         Usuario user = new Usuario(email, contraseña);
         user.generateXML();
         user.writeXML();
     }else{
         System.out.println("Adiós!");
     }
     sc.close();
 }   
}
