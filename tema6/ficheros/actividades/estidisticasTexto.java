import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Crea un programa que analice un fichero de texto plano y que muestre las
 * siguientes estadisticas:
 * nº de letras, nº de palabras, nº de lineas, % de vocales, % de consonantes, %
 * espacios y % de tabuladores.
 */

public class estidisticasTexto {
    public static void main(String[] args) throws IOException {
        // Contadores y atributos
        int contadorLetras = 0;
        int contadorPalabras = 0;
        int contadorLineas = 0;
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        int contadorEspacios = 0;
        int contadorTabuladores = 0;
        // Lector del fichero
        BufferedReader lectorFich = new BufferedReader(new FileReader("tema6/ficheros/actividades/fichero.txt"));
        String cadena = lectorFich.readLine().toLowerCase();

        try {
            while (cadena != null) {
                // Contador de lineas
                contadorLineas++;
                // recorremos la cadena para analizarla y poder contar
                // Contador palabras
                for (int i = 0; i < cadena.length(); i++) {
                    char caracter = cadena.charAt(i);

                    if (Character.isLetter(cadena.charAt(i))) {
                        contadorLetras++;
                    }
                    if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                        contadorVocales++;
                    } else if (caracter != ' ' || caracter != 'a' || caracter != 'e' || caracter != 'i'
                            || caracter != 'o' || caracter != 'u') {
                        contadorConsonantes++;
                    }
                    if (caracter == ' ') {
                        contadorEspacios++;
                    }

                }

                cadena = lectorFich.readLine();
            }

            System.out.println("Letras:\t\t" + contadorLetras + " \n"
                    + "Palabras:\t" + contadorPalabras + " \n"
                    + "Lineas:\t\t" + contadorLineas + " \n"
                    + "Vocales:\t" + contadorVocales + " \n"
                    + "Consonantes:\t" + contadorConsonantes + " \n"
                    + "Espacios:\t" + contadorEspacios + " \n"
                    + "Tabuladores:\t" + contadorTabuladores + " \n");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getLocalizedMessage());
        }
        lectorFich.close();

    }

}
