/*
 * Hay un tipo de pasatiempos que propone descifrar un texto del que se han suprimido las vocales. 
 * Por ejemplo, el texto ".n .j.mpl. d. p.s.t..mp.s" se descrifra sustituyendo cada punto por una vocal. 
 * La solución es "un ejemplo de pasatiempos".
 * Diseña un programa que ayude al creador de pasatiempos. 
 * Recibirá una cadena y mostrará otra en la que cada vocal ha sido reemplazada por un punto.
 */
public class pasatiempos {
    public static void crearPasatiempo(String pasatiempo){
        String cadenaimp = "";
        for (int i = 0; i < pasatiempo.length(); i++) {
            if (pasatiempo.charAt(i) == 'a' || pasatiempo.charAt(i) == 'e' || pasatiempo.charAt(i) == 'i' || pasatiempo.charAt(i) == 'o' || pasatiempo.charAt(i) == 'u') {
                cadenaimp = pasatiempo.replace('a', '.').replace('e', '.').replace('i', '.').replace('o', '.').replace('u', '.');
             }
         }
         System.out.println(cadenaimp);
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Escribe tu cadena: ");
        crearPasatiempo(cadena.toLowerCase());
    }
}
