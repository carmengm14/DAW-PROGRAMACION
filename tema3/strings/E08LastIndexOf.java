/** Escribe un programa que devuelva la posición de la última ocurrencia de una cadena en otra Funciones a utilizar String.lastIndexOf(); */

public class E08LastIndexOf {
    public static int ultimaPosicion(String cadena1, String cadena2) {
		return cadena1.lastIndexOf(cadena2);
	}

	public static void main(String[] args) {

        String cadena1 = Utilidades.leerCadena("Introduce 1º palabra = "); 
        String cadena2 = Utilidades.leerCadena("Introduce 2º palabra = ");

		int resultado = ultimaPosicion(cadena1, cadena2);

		if (resultado > 0) {
			System.out.println("La última posición de '" + cadena2 + "' en '" + cadena1 + "' es: " + resultado);
		} else {
			System.out.println("La cadena '" + cadena2 + "' NO está contenida en '" + cadena1 + "'");
		}

	}
}
