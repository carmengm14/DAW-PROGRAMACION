package ejemplos;
// SequenceInputStream sirve para poder pegar de forma secuencial diferentes InputStream. Este codigo lo que hace es mirar el contenido de ent_1 y los enseña
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Ejemplo3 {
    public static void main(String[] args) throws IOException{
        
        String nomFich = "f1.txt";
        FileInputStream f1 = new FileInputStream("/home/alumno/Documentos/f/" + nomFich);
        String ent_1 = "Esto es un array de bytes con caracteres raros: á ç ñ";
        ByteArrayInputStream f2 = new ByteArrayInputStream(ent_1.getBytes());
        SequenceInputStream f_in = new SequenceInputStream(f1,f2);
        int c = f_in.read();
        while (c != -1) {
            System.out.print((char) c);
            c = f_in.read();
        }
        System.out.println("");
        f_in.close();
        f1.close();
        f2.close();
    }
}
