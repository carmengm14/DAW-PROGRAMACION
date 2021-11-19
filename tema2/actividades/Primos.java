package tema2.actividades;
/* Primos.java Crea un programa que muestre en pantalla todos los números primos entre 3 y 100,
usando la función creada en el ejercicio anterior. Puedes llamar a la función creada en el ejercicio anterior
de la siguiente forma: Primo.esPrimo(numero);
*/
public class Primos {
    public static void main(String[] args) {
        for (int i = 3; i < 101; i++) {
            System.out.println(Primo.esPrimo(i));
        }
    }
}
