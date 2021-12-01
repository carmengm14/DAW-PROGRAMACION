/* Escribid un programa Java para encontrar el número de enteros pares e impares en un array dado de números enteros. */
public class E06ParesImpares {
   /*
   MANERA FACIL Y RAPIDA
    public static void main(String[] args) {
        int[] numeros = {1,2,3,45,656,544,7,8,989,10};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " = par");
            }else{
                System.out.println(numeros[i] + " = impar");
            }
        }
    }*/
    public static void main(String[] args) {
        int[] numeros = {1,2,3,45,656,544,7,8,989,10};
        int[] par = new int [10];
        int[] impar = new int [10];
        int contador1= 0;
        int contador2= 0;
        
        
        for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 == 0) {
                    par[contador1] = numeros[i];
                    contador1++;
                }else{
                    impar[contador2] = numeros[i];
                    contador2++;
                }     
        }
            System.err.print("PARES = ");
            for (int i=0; i < contador1; i++) {
                System.out.print(par[i] + ", ");
            }
            System.out.println(" ");
            System.err.print("IMPARES = ");
            for (int i=0;i< contador2; i++) {
                System.out.print(impar[i] + ", ");
            }
            System.out.println(" ");
        }
}

