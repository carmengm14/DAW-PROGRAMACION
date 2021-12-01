
/*Escribid un programa Java para eliminar de un array un elemento específico (índice) introducido 
por el usuario (moviéndolo al final del mismo). Si el índice es mayor que el tamaño del array, debe
decírselo al usuario y volver a pedírselo.*/

public class E01Eliminar {
   public static void main(String[] args) {
        int[] numeros = {1,2,10,94,35,74,58,20,18,7,68};
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
        System.out.println(numero);
        System.out.println(" ");
    }
    
}

/*SOLUCION DE JULIO
public static void main(String[] args) {
    int [] elementos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int indice;

    indice =  obtenerIndice(elementos);
    eliminarElemento(elementos, indice);
    Utilidades.mostrarArray(elementos);
}
public static int obtenerIndice(int[] elementos) {
    int indice;
    do {
        indice = Utilidades.leerEntero("Indice de elemento a eliminar");
    } while((indice < 0) || (indice > (elementos.length - 1)));
    return indice;
}
public static void eliminarElemento(int[] elementos, int indiceBorrar) {
    int elementoBorrar = elementos[indiceBorrar];

    for (int i = indiceBorrar + 1; i < elementos.length; i++) {
        elementos[i - 1] = elementos[i];
    }
    elementos[elementos.length - 1] = elementoBorrar;
}
}
*/
