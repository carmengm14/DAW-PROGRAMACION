/** Escribe un programa que devuelva la posición de una cadena en otra Funciones a utilizar String.indexOf() */

public class E07IndexOf {
    public static int primeraPosicion(String cadena1, String cadena2) {
		return cadena1.indexOf(cadena2);
	}

	public static void main(String[] args) {

        String cadena1 = Utilidades.leerCadena("Introduce 1º palabra = "); 
        String cadena2 = Utilidades.leerCadena("Introduce 2º palabra = ");

		int resultado = primeraPosicion(cadena1, cadena2);

		if (resultado > 0) {
			System.out.println("La primera posición de '" + cadena2 + "' en '" + cadena1 + "' es: " + resultado);
		} else {
			System.out.println("La cadena '" + cadena2 + "' NO está contenida en '" + cadena1 + "'");
		}

	}
}
