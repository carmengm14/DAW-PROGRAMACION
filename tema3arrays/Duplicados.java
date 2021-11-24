/*Escribid un programa Java para encontrar los valores duplicados de un array de valores enteros.*/
public class Duplicados {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 2, 5, 7, 89, 89, 4};
        int duplicados = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i  + 1 ; j < numeros.length; j++){
                if(numeros[i] == numeros[j]){
                    duplicados++;
                }
            }
            System.out.print(duplicados + ",");
            duplicados = 0;
        }
        System.out.println(" ");
    }
}
