//EJEMPLO DE RELLENAR ARRAY DE JULIO
public class EJEMPLOARRAY {
    public static void main(String[] args) {
        //Creamos un array de 10 elementos que por ahora estan vacios con 0.
        int [] externo = new int [10]; 
        int [] externoGordo = new int [100];

        //Escribimos en el metodo llamado, nuestro array y el calor minimo y el maximo que queremos.
        /* CODIGO DEL METODO EMPLEADO QUE ESTA EN UTILIDADES.JAVA
       
        public static void rellenaArray(int[] array, int min, int max){
            
            AQUI SE USA ARRAY.LENGTH EN VEZ DE PONER UN NUMERO YA QUE SI PUSIESEMOS UN NUMERO COMO POR 
            EJEMPLO 10 Y EL USUARIO PONE 20 YA NO RECORRERIA TODO, SIN EMBARGO CON EL ARRAY.LENGHT RECORRERÁ
            EL NUMERO QUE PONGA EL USUARIO

		    for (int i = 0; i < array.length; i++) {
			    int aleatorio = (int) (Math.random() * (max - min + 1) + min);

                EL (INT) SIMPLEMENTE INDICA QUE SERAN NUMEROS ENTEROS EN LA FUNCION MATH QUE SE MULTIPLICA
                POR LOS NUMEROS ASIGNADOS.

			    array[i] = aleatorio;
		    }
	    }
        */
        //Esta funcion no devuelve nada porque esta hecha con void.
       Utilidades.rellenaArray(externo, 20, 40); 
       Utilidades.rellenaArray(externoGordo, 50, 70); 

    }
}
