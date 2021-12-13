/** Escribe un programa que compruebe si una cadena acaba con el contenido de otra. Funciones a utilizar String.endsWith() */

public class Ends {
    public static boolean acabaEn(String cadena1, String cadena2) {
		return cadena1.endsWith(cadena2);
	}
	public static void main(String[] args) {
		String cadena1 = Utilidades.leerCadena("Introduce 1º palabra = "); 
        String cadena2 = Utilidades.leerCadena("Introduce 2º palabra = ");
		
		if(acabaEn(cadena1, cadena2)){
			System.out.println("'" + cadena1 + "' acaba como '" + cadena2 + "'");
		}
		else {
			System.out.println("'" + cadena1 + "' NO acaba como '" + cadena2 + "'");
		}
	}
    
}