/**Escribe un programa que muestre si una cadena contiene (o no) a otra. Funciones a utilizar String.contains() */

public class E04Contains {
    
	public static boolean contiene(String cadena1, String cadena2) {
		return cadena1.contains(cadena2);
	}
	public static void main(String[] args) {
		String cadena1 = Utilidades.leerCadena("Introduce 1º palabra = "); 
        String cadena2 = Utilidades.leerCadena("Introduce 2º palabra = ");

		if (contiene(cadena1, cadena2)) {
			System.out.println("'" + cadena2 + "' está contenida en '" + cadena1 + "'");
		} else {
			System.out.println("'" + cadena2 + "' NO está contenida en '" + cadena1 + "'");
		}
	}
}
