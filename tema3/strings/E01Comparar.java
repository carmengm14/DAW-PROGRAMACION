/* Realiza un programa que diga si una cadena es mayor, menor o igual que otra cadena. Funciones a utilizar String.compareTo() */
public class E01Comparar {
    public static int comparar(String cadena1, String cadena2) {
		return cadena1.compareTo(cadena2);
	}
	public static void main(String[] args) {
		String cadena1 = Utilidades.leerCadena("Inroduce la 1º palabra =");
		String cadena2 = Utilidades.leerCadena("Introduce la 2º palabra = ");
		int resultado = comparar(cadena1, cadena2);
		
		if (resultado == 0){
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
