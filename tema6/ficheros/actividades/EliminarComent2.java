
/*Realiza un programa que elimine los comentarios de un programa escrito
en Java. Solo los comentarios que empiezan por */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EliminarComent2 {
    public static void main(String[] args) throws IOException {
        // atributos
        FileReader fileReader;
        BufferedReader lectorFich;
        BufferedWriter salidaFich;

        fileReader = new FileReader("./tema6/ficheros/actividades/eliminarcomentariocodigo2.java");
        lectorFich = new BufferedReader(fileReader);
        salidaFich = new BufferedWriter(
                new FileWriter("./tema6/ficheros/actividades/eliminarsincomentariocodigo2.txt"));

        String cadena = lectorFich.readLine();
        String comentario = "/*";
        String comentario2 = "*/";

        while (cadena != null) {

            String lineaFinal = cadena.trim();

            if (!lineaFinal.contains(comentario) && !lineaFinal.contains(comentario2)) {
                salidaFich.write(cadena + "\n");
            }

            cadena = lectorFich.readLine();
        }

        fileReader.close();
        lectorFich.close();
        salidaFich.close();

    }
}