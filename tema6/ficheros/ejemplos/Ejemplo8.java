package tema6.ficheros.ejemplos;
//lo mismo q en el ejemplo 2 pero mas corto ya q lo hacemos con StringReader y no con ByteArrayInputStream
import java.io.IOException;
import java.io.StringReader;

public class Ejemplo8 {
    public static void main(String[] args) throws IOException{
        
        String ent = "Esto es un array de bytes con caracteres raros: á ç ñ";
        StringReader f_in = new StringReader(ent);
        int c = f_in.read();
        while (c != -1) {
            System.out.print((char) c);
            c = f_in.read();
        }
        System.out.println(" ");
        f_in.close();
    }
}
