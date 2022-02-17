/*
 * Escribe un programa que compruebe si una cadena acaba con el contenido de otra
 */
public class ends {
    public static boolean acabaEn(String c1, String c2){
        if (c1.endsWith(c2)) {
            return true;
        }else{
            return false;
        }
    }
   public static void main(String[] args) {
       String cadena1 = Utilidades.leerCadena("Escribe una cadena: ");
       String cadena2 = Utilidades.leerCadena("Escribe otra cadena: ");
       if (acabaEn(cadena1, cadena2) == true){
        System.out.println(cadena1 + " acaba igual que, " + cadena2);
       }else{
        System.out.println(cadena1 + " es diferente a, " + cadena2);

       }
   } 
}
