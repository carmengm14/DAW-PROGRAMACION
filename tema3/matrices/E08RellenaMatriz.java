/* Rellena una matriz de 10 x 10 con valores aleatorios (0 o 1) e imprímela de la siguiente forma: */
public class E08RellenaMatriz {

    public static void 	mostrarMatriz(int matriz[][]) {
		int i,j; 
		int filas = matriz.length;
		int columnas = matriz[0].length;
		// Recorrido de las filas de la matriz
		for (i = 0; i < filas; i++) {
			  // Recorrido de las celdas de una fila
			  for (j = 0; j<columnas; j++) {
				  System.out.print(matriz[i][j] + " ");
			}
            System.out.println(" ");
		}
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

    public static void main(String[] args) {

        int [][] matriz = new int [10][10];
        rellenaMatriz(matriz, 0, 1);
        mostrarMatriz(matriz);
    }
}
