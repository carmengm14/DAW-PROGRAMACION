/* Realiza un programa que concatene dos Strings en un tercer String. Funciones a utilizar String.concat() */

public class Concat {
      
        public static String concatenar(String cadena1, String cadena2) {
            return cadena1.concat(cadena2);
        }
        public static void main(String[] args) {
            String cadena1 = Utilidades.leerCadena("Introduce 1º palabra = ");
            String cadena2 = Utilidades.leerCadena("Introduce 2º palabra = ");
            
            System.out.println("El resultado es: " + concatenar(cadena1, cadena2));
        }
}
