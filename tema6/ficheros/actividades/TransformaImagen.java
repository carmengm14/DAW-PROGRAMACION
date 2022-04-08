import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransformaImagen {
    //ATRIBUTOS
    File f = null;
    //CONSTRUCTOR
    public TransformaImagen(File fEnt) {  
        //substring lee caracter por caracter a partir de donde le digas por lo que en esta parte del codigo lo que le estamos diciendo es:
        //SI el nombre de fEnt NO es igual a .bmp a partir del . (esto se lo decimos gracias a substring que comprara el nombre con el indexOf que dice donde
        //empezar a comparar con el equals) NO se inicializara el file f pero si si es igual si que lo hará.
        if(!fEnt.getName().substring(fEnt.getName().indexOf(".")).equals(".bmp")) {
                
        }
        else {
            f = fEnt;
        }
    }
    //METODOS
    public void transformaNegativo() throws IOException {
        FileInputStream reader = new FileInputStream(this.f);
        File f_Out = new File("./tema6/ficheros/fotos/ficheroFotoNeg.bmp");
        FileOutputStream writer = new FileOutputStream(f_Out);

        byte[] cabecera = new byte[54];
        
        int c = 0;

        reader.read(cabecera);
        writer.write(cabecera);

        c = reader.read();
        while(c != -1) {
            writer.write(((char)(255 - c)));
            c = reader.read();
        }

        reader.close();
        writer.close();
    }

    public void transformaOscuro() throws IOException {
        FileInputStream reader = new FileInputStream(this.f);
        File f_Out = new File("./tema6/ficheros/fotos/ficheroFotoOsc.bmp");
        FileOutputStream writer = new FileOutputStream(f_Out);

        byte[] cabecera = new byte[54];
        
        int c = 0;

        reader.read(cabecera);
        writer.write(cabecera);

        c = reader.read();
        while(c != -1) {
            writer.write((char)c/2);
            c = reader.read();
        }

        reader.close();
        writer.close();
    }
    public void transformaNegroBlanco() throws IOException {
        FileInputStream reader = new FileInputStream(this.f);
        File f_Out = new File("./tema6/ficheros/fotos/ficheroFotoBlanNeg.bmp");
        FileOutputStream writer = new FileOutputStream(f_Out);

        byte[] cabecera = new byte[54];
        
        int r = 0;
        int g = 0;
        int b = 0;

        reader.read(cabecera);
        writer.write(cabecera);

        r = reader.read();
        while(r != -1) {
            g = reader.read();
            b = reader.read();

            int media = (r+g+b)/3;

            writer.write((char)media);
            writer.write((char)media);
            writer.write((char)media);

            r = reader.read();
        }

        reader.close();
        writer.close();
        
    }
}