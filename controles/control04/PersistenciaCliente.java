import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class PersistenciaCliente extends Cliente {
    //Atributos
    private List<Cliente> listaClientes;
    
    //Constructor
    public PersistenciaCliente(String nombre, String apellidos, String nif, int id, String email) {
        super(nombre, apellidos, nif, id, email);
        //TODO Auto-generated constructor stub
        listaClientes.add(this);
    }

    //getters and setters
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    //Metodos
   
    public void write() throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("./control04/CLIENTES.dat"));
        String cliente = " ";
        while (!listaClientes.isEmpty()) {
            cliente += getId() + ", " + getNif() + ", " + getNombre() + ", " + getApellidos() + ", " + getEmail() + ".";
            writer.write(cliente);
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
