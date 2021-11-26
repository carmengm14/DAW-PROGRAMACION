//EJEMPLO DE RELLENAR ARRAY DE JULIO
public class EJEMPLOARRAY {
    public static void main(String[] args) {
        //Creamos un array de 10 elementos que por ahora estan vacios con 0.
        int [] externo = new int [10];

        //Escribimos en el metodo llamado, nuestro array y el calor minimo y el maximo que queremos.
        /* CODIGO DEL METODO EMPLEADO QUE ESTA EN UTILIDADES.JAVA
       
        public static void rellenaArray(int[] array, int min, int max) {
		    for (int i = 0; i < array.length; i++) {
			    int aleatorio = (int) (Math.random() * (max - min + 1) + min);
			    array[i] = aleatorio;
		    }
	    }

        */
        //Esta funcion no devuelve nada porque esta hecha con void.
        Utilidades.rellenaArray(externo, 20, 40); 
    }
}
