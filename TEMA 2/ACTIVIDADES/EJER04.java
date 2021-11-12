
/* Positivos.java  Escribe un método llamado  positivos  que muestre cuántos números de un array son
positivos.  */
public class EJER04 {
    public static int positivos (int [] notas){
        int positivos = 0;
        
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0) {
                positivos++;
            }
        }
        System.out.print("Numero total de postivos: ");
        return positivos;
    }

    public static void main(String[] args) {
        int [] notas = {5, 10, -4, 3, 5, 7, 8, -5}; 
        System.out.println(positivos(notas));

        int [] notas2 = {-2};
        System.out.println(positivos(notas2));

        int [] notas3 = {3,4,5};
        System.out.println(positivos(notas3));
    }
}