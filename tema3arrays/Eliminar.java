/*Escribid un programa Java para eliminar de un array un elemento específico (índice) introducido 
por el usuario (moviéndolo al final del mismo). Si el índice es mayor que el tamaño del array, debe
decírselo al usuario y volver a pedírselo.*/

public class Eliminar {
    public static void main(String[] args) {
        int[] numeros = {0,2,10,94,35,74,58,20,18,7,68};
        int posicion;       
        while(true) {
            posicion = Utilidades.leerEntero("Dime que numero quieres eliminar del 0 al 10: ");                   
            if (posicion > numeros.length) {
                System.out.println("Tu numero no esta permitido");
            } else {
                 break;
            }
        }
        int numero = numeros[posicion];
        if (posicion < numeros.length) {
            numeros[posicion] = 0;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(" = " + numero);
        System.out.println(" ");
    }
    
}