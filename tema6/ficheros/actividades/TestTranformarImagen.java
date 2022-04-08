import java.io.File;
import java.io.IOException;

public class TestTranformarImagen {
    public static void main(String[] args) {
        File image = new File("./tema6/ficheros/actividades/penyagolosa.bmp");
        TransformaImagen ti = new TransformaImagen(image);
        try {
            ti.transformaNegativo();
            ti.transformaNegroBlanco();
            ti.transformaOscuro();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}