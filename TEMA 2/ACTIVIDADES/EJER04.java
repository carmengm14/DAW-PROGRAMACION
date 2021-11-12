package ACTIVIDADES;
/* Positivos.java  Escribe un método llamado  positivos  que muestre cuántos números de un array son
positivos.  */
public class EJER04 {
    public static int positivos (){
        int positivos = 0;
        int [] notas = {5, 10, -4, 3, 5, 7, 8, -5}; 

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0) {
                positivos++;
            }
        }
        return positivos;
    }

    public static void main(String[] args) {
        System.out.println(positivos());
    }
}