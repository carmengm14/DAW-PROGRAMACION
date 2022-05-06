
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;

public class PersistenciaCliente2 {
    // Atributos
    private List<Cliente> listado;

    // Constructor
    public PersistenciaCliente2(List<Cliente> listado) {
        this.listado = listado;
    }

    // getters and setters
    public List<Cliente> getlistado() {
        return listado;
    }

    // Metodos
    // String separador = File.separator;
    public void write() throws IOException {
        /*
         * BufferedWriter writer = new BufferedWriter(new
         * FileWriter("C:"+separador+"Users"+separador+"CGM1414"+separador+"OneDrive"+
         * separador+"Escritorio"+separador
         * +"CARMEN"+separador+"java"+separador+"DAW-PROGRAMACION-1"+separador+
         * "controles" + separador + "control04" + separador + "CLIENTES.dat"));
         * RUTA WINDOWS
         * C:\Users\CGM1414\OneDrive\Escritorio\CARMEN\java\DAW-PROGRAMACION-1\controles
         * \control04
         */
        try (DataOutputStream writer = new DataOutputStream(
                new FileOutputStream("controles/control04/CLIENTES2.dat"));
                ObjectOutputStream salida = new ObjectOutputStream(writer)) {

            salida.writeObject(listado);
            /*
             * for (int i = 0; i < listado.size(); i++) {
             * writer.writeUTF("Nombre" + getlistado());
             * }
             */
            writer.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        /*
         * DataOutputStream writer = new DataOutputStream(
         * new FileOutputStream("controles/control04/CLIENTES2.dat"));
         */

    }

    public void read() throws IOException, ClassNotFoundException {
        DataInputStream f = new DataInputStream(new FileInputStream(
                "controles/control04/CLIENTES2.dat"));
        ObjectInputStream entrada = new ObjectInputStream(f);

        while (f.available() > 0) {
            System.out.println(entrada.readObject());
        }
        f.close();
    }
}
