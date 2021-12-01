/*Escribid un programa Java para mover todos los 0 al final de un array. Mantened el orden relativo de los otros elementos de la array (distintos de cero).*/
public class E07MoverCeros {
    public static void main(String[] args) {
        int[] numeros = {0,0,1,2,0,5,0,9,8,4};
        int [] noCeros = new int [10];
        int [] ceros = new int [10];
        int contador1 = 0;
        int contador2 = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                noCeros[contador1] = numeros[i];
                contador1++;
            } else {
                ceros[contador2] = numeros [i];
                contador2++;
            }
        }
        
        for (int i = 0; i < contador1; i++) {
            System.out.print(noCeros[i] + " ");
        }
        for (int i = 0; i < contador2; i++) {
            System.out.print(ceros[contador2] + " ");
        }
        System.out.println(" ");
    }
}
