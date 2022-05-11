import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import javax.lang.model.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.*;

public class PersistenciaCliente3XML {
    // Atributos
    private List<Cliente> listado;

    // Constructor
    public PersistenciaCliente3XML(List<Cliente> listado) {
        this.listado = listado;
    }

    // getters and setters
    public List<Cliente> getlistado() {
        return listado;
    }

    // Metodos
    public void write() throws IOException, ClassNotFoundException, ParserConfigurationException, TransformerException {
        ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("controles/control04/CLIENTEScopia.dat"));
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = doc.createElement("clientes");
        doc.appendChild(root);

        Cliente cliente;

        try {
            while (true) {
                cliente = (Cliente) fichero.readObject();

                Element cliElement = doc.createElement("cliente");
                cliElement.setAttribute("id", Integer.toString(cliente.getId()));

                Element hijo = doc.createElement("nombre");
                hijo.appendChild(doc.createTextNode(cliente.getNombre()));
                cliElement.appendChild(hijo);

                Element hijo2 = doc.createElement("apellidos");
                hijo2.appendChild(doc.createTextNode(cliente.getApellidos()));
                cliElement.appendChild(hijo2);

                Element hijo3 = doc.createElement("nif");
                hijo3.appendChild(doc.createTextNode(cliente.getNif()));
                cliElement.appendChild(hijo3);

                Element hijo4 = doc.createElement("email");
                hijo4.appendChild(doc.createTextNode(cliente.getEmail()));
                cliElement.appendChild(hijo4);

                root.appendChild(cliElement);
            }
        } catch (EOFException eof) {
            // TODO: handle exception
            fichero.close();
        }

    }

    public void read() throws IOException, ClassNotFoundException {
        DataInputStream f = new DataInputStream(new FileInputStream(
                "controles/control04/CLIENTES2.xml"));
        ObjectInputStream entrada = new ObjectInputStream(f);

        while (f.available() > 0) {
            System.out.println(entrada.readObject());
        }
        f.close();
    }
}
