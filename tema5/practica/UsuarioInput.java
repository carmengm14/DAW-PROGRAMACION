import java.util.Scanner;

public class UsuarioInput {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int respuesta;
     do{
        System.out.println("Escribe: \n1- Crear Usuario \n0- Salir \n=============");
        respuesta = sc.nextInt();
     if (respuesta == 1) {
         System.out.print("Escribe tu email: ");
         String email = sc.next();
         System.out.print("Escribe una contraseña: ");
         String contraseña = sc.next();
         Usuario user = new Usuario(email, contraseña);
         user.generateXML();
         user.writeXML();
     }else if(respuesta < 0 && respuesta > 1){
         System.out.println("No es una respuesta válida");
     }
    }while(respuesta != 0);
        System.out.println("Adiós!");
     sc.close();
 }   
}
