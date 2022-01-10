/*
Realiza un programa que lea una frase y la convierta en unas siglas. Por ejemplo, Escuela Oficial de Idiomas, se convierte en EOI.
*/
public class E16Siglas {
	public static String siglas(String[] palabras) {
		String siglas = "";

        // Al poner los dos puntos, es un for especial el cual recorre todas las palabras y en palabra se asigna la palabra actual, imagina de tenemos "hola", "pepito", "manolito", pues seria: hola : hola, pepito, manolito    pepito: hola,pepito, manolito asi consecutivamente.*/

		for (String palabra : palabras) {
			char letra = palabra.charAt(0);
			if (Character.isUpperCase(letra)) {
				siglas = siglas + letra;
			}

		}
		return siglas;
	}
	public static void main(String[] args) {

		String solucion = siglas(Utilidades.dividirEnPalabras(Utilidades.leerCadena("Introduce texto: ")));
		System.out.println(solucion);
		// O también 
		//System.out.println(siglas(Utilidades.dividirEnPalabras(Utilidades.leerCadena("Introduce texto: "))));
	}


}
