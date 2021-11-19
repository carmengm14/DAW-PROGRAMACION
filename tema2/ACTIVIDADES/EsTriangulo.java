/*  EsTriangulo.java  Si te dan tres palitos, puedes o no ser capaz de organizarlos en un triángulo. Por
ejemplo, si uno de los palos mide 12 cm de largo y los otros dos tienen un cm de largo, no podrás hacer que
los palitos cortos se encuentren en el medio. Para tres longitudes, hay una prueba simple para ver si es
posible formar un triángulo: 
Si cualquiera de las tres longitudes es mayor que la suma de las otras dos, no puedes formar un triángulo
Escribe un método llamado  esTriangulo  que toma tres enteros como argumentos y devuelve true o
false, dependiendo de si puede o no formar un triángulo a partir de palitos con las longitudes dadas. */ 
import java.util.Scanner;
public class EsTriangulo {
    public static boolean esTriangulo (int x, int y, int z){
        if ( x + y  > z && x + z > y && y + z > x) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.print("Escribe la longitud de un lado: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.print("Escribe la longitud de otro lado: ");
        int y = sc.nextInt();

        System.out.print("Escribe la longitud de otro lado: ");
        int z = sc.nextInt();
        sc.close();

        System.out.println(esTriangulo(x, y, z));
    }
}
