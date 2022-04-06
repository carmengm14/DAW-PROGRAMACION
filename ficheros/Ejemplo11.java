import java.io.IOException;
import java.io.PrintStream;

public class Ejemplo11 {
    public static void main(String[] args) throws IOException{
        String nomFich = "f10.text";
        PrintStream f_out = new PrintStream("/home/alumno/Documentos/f/" + nomFich);
        
        float a = (float) 5.25;
        String b = "Hola.";
        
        f_out.println(b);
        f_out.println("¿Qué tal?");
        f_out.println(a + 3);
        f_out.printf("El numero %d en hexadecimal es %x", 27, 27);

        f_out.close();
    }
}
