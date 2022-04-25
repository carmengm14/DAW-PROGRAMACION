/*Realiza un programa que elimine los comentarios de un programa escrito
en Java. Solo los comentarios que empiezan por //*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EliminarComent {
    public static void main(String[] args) throws IOException {
        //atributos
    FileReader fileReader1;
    BufferedReader lectorFich1;

    fileReader1 = new FileReader("./tema6/ficheros/ff/f2.txt" );

    lectorFich1 = new BufferedReader(fileReader1);

    }
    
}
