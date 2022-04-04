import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ejemplo2 {
    public static void main(String[] args) throws IOException {
        String ent_1 = "Esto es un array de bytes con caracteres raros: á ç ñ";
        byte[] ent = ent_1.getBytes();

        ByteArrayInputStream f_in = new ByteArrayInputStream(ent);
        int c = f_in.read();

        while(c != -1){
            System.out.print((char) c);
            c = f_in.read();
        }
        System.out.println("");
        f_in.close();
    }    
}
