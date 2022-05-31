import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class GenerosPelis {
    private List<Cliente> listado;

    // Constructor
    public GenerosPelis(List<Cliente> listado) {
        this.listado = listado;
    }

    // getters and setters
    public List<Cliente> getlistado() {
        return listado;
    }

    public void writeGender() throws IOException, ClassNotFoundException, ParserConfigurationException, TransformerException {
        ObjectInputStream fichero = new ObjectInputStream(
            new FileInputStream("controles/control04/CLIENTES2copia.dat"));
    // Creamos el doc que empezara con el nodo raiz
    Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
    Element clientes = doc.createElement("clientes");
    doc.appendChild(clientes);
    // creamos la variable cliente donde iremos metiendo los clientes 1 a 1
    Cliente cliente;

    try {
        while (true) {
            // Leemos los datos del fichero que hemos cogido anteriormente y lo guardamos en
            // cliente
            cliente = (Cliente) fichero.readObject();

            // creamos el nombre del nodo padre , y le ponemos un atributo al cual le
            // ponemos texto (El id en este caso)
            Element cliElement = doc.createElement("cliente");
            cliElement.setAttribute("id", Integer.toString(cliente.getId()));

            // creamos los hijos del nodo padre y les ponemos texto, luego los añadiremos al
            // nodo padre para decir que son hijos de ese nodo y no de otro padre
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

            // Guarda todos los nodos del cliente creado y asi cuando pase al siguiente
            // cliente se mantendran almacenados en vez de superponerse
            clientes.appendChild(cliElement);
        }
    } catch (EOFException eof) {
        // TODO: handle exception
        fichero.close();
    }
    // Creamos el transformador, el source y el Stream que seran los encargados de
    // escribir todo lo que hayamos hecho anteriormente.
    Transformer transformador = TransformerFactory.newInstance().newTransformer();
    DOMSource source = new DOMSource(doc);
    StreamResult resultado = new StreamResult(new FileOutputStream("controles/control04/CLIENTESXML.dat"));

    transformador.transform(source, resultado);
    }
}
