import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaCliente {
    //Atributos
    private List<Cliente> clientes;

    //Constructor
    public PersistenciaCliente(List<Cliente> clientes){
        this.clientes = new ArrayList<Cliente>();
        clientes.addAll(clientes);
    }

    //getters and setters
    public List<Cliente> getclientes() {
        return clientes;
    }

    public void setclientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    //Metodos
    String separador = File.separator;
    public void write() throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:"+separador+"Users"+separador+"CGM1414"+separador+"OneDrive"+separador+"Escritorio"+separador+"CARMEN"+separador+"java"+separador+"DAW-PROGRAMACION-1"+separador+"controles" + separador + "control04" + separador + "CLIENTES.dat"));
      /*  C:\Users\CGM1414\OneDrive\Escritorio\CARMEN\java\DAW-PROGRAMACION-1\controles\control04*/
        String linea = " ";
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            linea += cliente.getId() + ", " + cliente.getNif() + ", " + cliente.getNombre() + ", " + cliente.getApellidos() + ", " + cliente.getEmail() + ".";
            writer.write(linea);
        }
        writer.close();
    }
    public void read() throws IOException{
        FileReader fileReader = new FileReader("./control04/CLIENTES.dat");
        BufferedReader lectorFich = new BufferedReader(fileReader);
        String cadena = lectorFich.readLine();
        
        while (cadena != null ) {
            
            String lineaFinal = cadena.trim();
            
            if (lineaFinal.endsWith(".")){
                System.out.println(cadena);
            }

            cadena =  lectorFich.readLine();
        }
        lectorFich.close();
    }
}
