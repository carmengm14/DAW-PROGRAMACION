import java.io.IOException;
import java.util.Scanner;

/*Programa que lea un carácter por teclado y compruebe si es una letra mayúscula*/
public class EJERCICIO02 {
    public static void main(String[] args) throws IOException {
        //variables y lector
        Scanner sc = new Scanner(System.in);
        char caracter;

        System.out.print("Escribe un caracter para comprobar su estilo: ");
        /*Usaremos el (char) System.in.read() para leer un solo caracter ya que no hay 
        ningun metodo creado para leer diractamente el char*/
        caracter = (char) System.in.read();

        if (Character.isLowerCase(caracter)) {
            System.out.println(caracter + " Es minuscula");
        }else if(Character.isLowerCase(caracter)){
            System.out.println(caracter + " Es mayuscula");
        }else{
            System.out.println("NO SE PERMITE ESE CARACTER");
        }
        sc.close();
    }
}
