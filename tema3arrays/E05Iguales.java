/*Escribir un programa Java para probar la igualdad de dos vectores (en este caso, como será difícil que os dé dos veces el mismo array, igualad el segundo al primero, para probarlo, Esto se hace mediante el método clone() del array).*/

public class E05Iguales {
    public static void main(String[] args) {
        int [] array1 = {1,5,6,8,9};
        int [] arrayClonado = array1.clone();
        
        boolean iguales = true;
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < arrayClonado.length; j++) {
                    if(array1[i] == arrayClonado[j]){
                        System.out.println(iguales);
                    }else{
                        System.out.println("SON DIFERENTES");
                    }
            }           
        }
    }
}
