/* Escribid un programa Java para encontrar los elementos comunes entre dos arrays de enteros. */
public class E03Comunes {
    public static void main(String[] args) {
        //CREAMOS LOS ARRAYS
        int[] array1 = {1 ,2 ,5 ,9 ,54 ,4 ,8 };
        int[] array2 = {2, 45, 6, 4, 78, 56, 8};
        //LOS RECORREMOS Y COMPARAMOS
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                    if(array1[i] == array2[j]){
                        System.out.print(array1[i] + ", ");
                }
            }           
        }
        System.out.println("FIN ");
    }
}
