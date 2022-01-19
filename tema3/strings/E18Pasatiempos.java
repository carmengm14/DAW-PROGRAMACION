/** Hay un tipo de pasatiempos que propone descifrar un texto del que se han suprimido las vocales. Por ejemplo, el texto ".n .j.mpl. d. p.s.t..mp.s" se descrifra sustituyendo cada punto por una vocal. La solución es "un ejemplo de pasatiempos".
Diseña un programa que ayude al creador de pasatiempos. Recibirá una cadena y mostrará otra en la que cada vocal ha sido reemplazada por un punto. */

public class E18Pasatiempos {
    public static void cambiarVocales(String cadena) {
        //hacer las letras todas minusculas para compararlas bien.
        cadena.toLowerCase();
        char punto;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                punto = cadena.charAt(i);
                punto = '.';
                System.out.println(punto);
            }
            
        }
        
    }
    public static void main(String[] args) {

        String cadena = Utilidades.leerCadena("Escribe tu cadena: ");
        cambiarVocales(cadena);
    }
}
