/*Escribir un programa Java para probar la igualdad de dos vectores (en este caso, como será difícil que os dé dos veces el mismo array, igualad el segundo al primero, para probarlo, Esto se hace mediante el método clone() del array).*/

public class E05Iguales {
    public static void main(String[] args) {
        int [] array1 = {1,5,6,8,9};
        int [] arrayClonado = array1.clone();
        //array1.clone();
        boolean iguales = true;
                
        System.out.println("SON IGUALES LOS SIGUIENTES NUMEROS: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " = ");
                    if(array1[i] == arrayClonado[i]){
                        System.out.println(iguales);
                    }else{
                        System.out.println(iguales = false);
                    }
        }   
        System.out.println("FIN");        
    }
    
}

