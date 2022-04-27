/*Realiza un programa que elimine los comentarios de un programa escrito
en Java. Solo los comentarios que empiezan por //*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EliminarComent {
    public static void main(String[] args) throws IOException {
        //atributos
    FileReader fileReader;
    BufferedReader lectorFich;
    BufferedWriter salidaFich;

    fileReader = new FileReader("./tema6/ficheros/actividades/eliminarcomentariocodigo.java");
    lectorFich = new BufferedReader(fileReader);
    salidaFich = new BufferedWriter(new FileWriter("./tema6/ficheros/actividades/eliminarsincomentariocodigo.java"));
    
    String cadena = lectorFich.readLine();
    String comentario = "//";
       
    while (cadena != null ) {
        String lineaFinal = comentario.trim();
        if (lineaFinal.contains(comentario)) {
            salidaFich.write(cadena + System.getProperty("comentario"));
        }
        lectorFich.readLine();
    }
   
fileReader.close();
lectorFich.close();
salidaFich.close();
}
}

