package repasoexamen;

/** Crea un array, en las posiciones pares han de aparecer los multiplos de 3 empezando por el 3 y en las impares los multiplos de 7 empezando por el 7, despues de rellenarlo teneis imprimir las posiciones y el contenido del array cuyas posiciones son multiplo de 13 */
public class E01 {
    public static void main(String[] args) {
        //creamos el array
        int [] numeros = new int [1000];
        int multiplo3 = 3;
        int multiplo7 = 7;
       
        //En las posiciones pares ponemos multiplos de 3.
        for (int i = 0; i < numeros.length; i = i + 2) {
            numeros[i] = multiplo3;
            multiplo3 = multiplo3 + 3;
        }

        //En las posiciones impares ponemos multiplos de 7.
        for (int i = 1; i < numeros.length; i = i + 2) {
            numeros[i] = multiplo7;
            multiplo7 = multiplo7 + 7;
        }

        for (int i = 13; i < numeros.length; i = i + 13) {
            System.out.println(numeros[i]);
        }
    }
}
