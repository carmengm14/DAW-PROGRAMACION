import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PersistenciaCliente {
    // Atributos
    private List<Cliente> listado;

    // Constructor
    public PersistenciaCliente(List<Cliente> listado) {
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
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("/home/alumno/Desktop/discoExtra/DAW-PROGRAMACION/controles/control04/CLIENTES.dat"));

        String linea = " ";
        for (int i = 0; i < listado.size(); i++) {
            Cliente cliente = listado.get(i);
            linea = cliente.getId() + ", " + cliente.getNif() + ", " + cliente.getNombre() + ", "
                    + cliente.getApellidos() + ", " + cliente.getEmail() + ".";
            writer.write(linea + "\n");
        }
        writer.close();
    }

    public void read() throws IOException {
        FileReader fileReader = new FileReader(
                "/home/alumno/Desktop/discoExtra/DAW-PROGRAMACION/controles/control04/CLIENTES.dat");
        BufferedReader lectorFich = new BufferedReader(fileReader);
        String cadena = lectorFich.readLine();

        while (cadena != null) {

            String lineaFinal = cadena.trim();

            if (lineaFinal.endsWith(".")) {
                System.out.println(cadena);
            }

            cadena = lectorFich.readLine();
        }
        lectorFich.close();
    }
}
