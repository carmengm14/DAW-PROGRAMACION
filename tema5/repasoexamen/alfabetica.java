/*
 * Una palabra es alfabética si todas sus letras están ordenadas alfabéticamente.
 *  Por ejemplo, "amor", "chino" e "himno" son palabras alfabéticas. 
 *  Diseña un programa que nos diga si una palabra es alfabética o no.
 */
public class alfabetica {
    public static boolean esAlfabetica(String palabra){
        for (int i = 1; i < palabra.length(); i++) {
            if (palabra.charAt(i) < palabra.charAt(i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String palabra = Utilidades.leerCadena("Escribe tu palabra: ");

        if (palabra.length()>1) {
            if (esAlfabetica(palabra) == true) {
                System.out.println(palabra + " es Alfabetica");
            }else{
                System.out.println(palabra + " no es Alfabetica");
            } 
        }else{
            System.out.println("Escribe una palabra de más de una letras");
        }
        
    }
}