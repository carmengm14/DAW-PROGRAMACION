/*Escribid un programa Java para encontrar los valores duplicados de un array de valores enteros.*/
public class E02Duplicados {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 2, 5, 7, 89, 89, 4}; //creamos el array
        int [] numsduplics = new int [5];
        int duplicados = 0; //asignamos valor 0 a duplicados
        
        // hacemos un bucle que recorra la longitud del array para comprobar si los numeros se repiten o no.

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i  + 1 ; j < numeros.length; j++){
                if(numeros[i] == numeros[j]){
                    numsduplics[duplicados] = numeros[j];
                }
            }           
        }
            // System.out.print(duplicados + ",");
        System.out.print(numsduplics[duplicados] + ", "); 
        System.out.println(" ");
    }
}
