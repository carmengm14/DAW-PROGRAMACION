/*Realiza un programa que diga si una cadena es mayor, menor o igual que otra cadena sin importar si son mayúsculas o minúsculas (ignore case, en inglés).Funciones a utilizar String.compareToIgnoreCase() El método debe devolver el valor devuelto por String.compareToIgnoreCase().*/

public class CompararIgnoreCase {
    public static int compararIgnorandoCase(String cadena1, String cadena2) {
		return cadena1.compareToIgnoreCase(cadena2);
	}
	public static void main(String[] args) {
		
		String cadena1 = Utilidades.leerCadena("Introduce 1º palabra = ");
		String cadena2 = Utilidades.leerCadena("Introduce 2º palabra = ");
		int resultado = compararIgnorandoCase(cadena1, cadena2);
		
		if (0 == resultado){
			System.out.println("Las cadenas son iguales");
		}
		else if (resultado > 0){
			System.out.println("'" + cadena1 + "' es mayor que '" + cadena2 + "'");
		}
		else {
			System.out.println("'" + cadena2 + "' es mayor que '" + cadena1 + "'");
		}
	}
}
