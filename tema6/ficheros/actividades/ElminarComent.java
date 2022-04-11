import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ElminarComent {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("./tema6/ficheros/actividades/ficheroJava.java"));
        String cadena = reader.readLine();

        String[] cadenaSeparada = cadena.toLowerCase().split(" ");
    }
}
