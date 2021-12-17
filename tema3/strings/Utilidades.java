import java.util.Scanner;

public class Utilidades {
	static Scanner inputValue = new Scanner(System.in);

	public static int leerEntero(String mensaje) {
		System.out.print(mensaje);
		return inputValue.nextInt();

	}

	public static double leerDoble(String mensaje) {
		System.out.print(mensaje);
		return inputValue.nextDouble();

	}

	public static char leerCaracter(String mensaje) {
		System.out.print (mensaje);
		// Leemos toda una cadena
		String cadena = inputValue.next();
		// y nos quedamos con el carácter 0 (el primero)
		char op = cadena.charAt(0);
		return op;

	}

	public static String leerCadena(String mensaje) {
		System.out.print(mensaje);
		return inputValue.nextLine();

	}

	public static void rellenaArray(int[] array, int min, int max) {
		for (int i = 0; i < array.length; i++) {
			int aleatorio = (int) (Math.random() * (max - min + 1) + min);
			array[i] = aleatorio;
		}
	}
	public static String[] dividirEnPalabras(String cadena){
    		// Quitar espacios en blanco al principio y al final
    		cadena=cadena.trim();
    		// Reemplazar uno o más espacios en blanco por un solo espacio
    		cadena=cadena.replaceAll(" +", " ");
    		// Dividir la cadena en partes por el carácter espacio (devuelve un array con cada una de las partes)
    		return cadena.split(" ");
	}
	public static void rellenaMatriz(int[][] matriz, int min, int max){
		// Producir nuevo int aleatorio entre 0 y (max-1)
		
		int filas = matriz.length;
		int columnas = matriz[0].length;
		//MATRI[0].LENGHT LEE LA LONGITUD DE LA LÍNEA 0 Y ASI SACA LA CANTIDAD DE COLUMNAS QUE TIENE LA FILA.
		//AHORA RECORREREMOS LA MATRIZ, MIRANDO LAS FILAS Y COLUMNAS.
		for (int i = 0; i < filas; i++){
			for (int j = 0; j < columnas; j++){
				/*EL (INT) TRANSFORMA EL RESULTADO DE MATRIZ[I][J] QUE ES DOUBLE POR CULPA DEL MATH.RANDOM()
				  A UN ENTERO */
			    matriz[i][j] = (int) (Math.random() * (max - min + 1) + min);

				/* I Y J MARCAN LA POSICION Y SE RELLENA CON UN NUMERO ALEATORIO, QUE ES LA OPERACION DE 
				   MATH.RANDOM() * (MAX - MIN + 1) + MIN); */
			}
		}
		//EJEMPLO DE COMO SE VERIA ESTO CON 3 COLUMNAS Y 4 FILAS:   0,0  0,1  0,2  0,3  
															//	    1,0  1,1  1,2  1,3
															//	    2,0  2,1  2,2  2,3
		
	}

	public static void 	mostrarMatriz(int matriz[][]) {
		int i,j; 
		int filas = matriz.length;
		int columnas = matriz[0].length;
		// Recorrido de las filas de la matriz
		for (i=0; i < filas; i++) {
			  // Recorrido de las celdas de una fila
			  for (j=0; j<columnas; j++) {
				  System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j] );
			}
		}
	}

	public static void 	mostrarArray(int matriz[]) {
		int i; 
		int filas = matriz.length;
		for (i=0; i < filas; i++) {
			System.out.println("matriz[" + i + "] = " + matriz[i] );
		}
	}
}