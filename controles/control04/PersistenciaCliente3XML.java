import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import javax.xml.parsers.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class PersistenciaCliente3XML{
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
        // Leemos el fichero con los objetos que queremos poner en el XML
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

                // creamos los hijos del nodo padre y les ponemos texto, luego los a??adiremos al
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

    public void read() throws ParserConfigurationException, FileNotFoundException, IOException, SAXException {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new FileInputStream("controles/control04/CLIENTESXML.dat"));
        Element raiz = (Element) doc.getChildNodes().item(0);
        NodeList clientes = raiz.getElementsByTagName("cliente");

        for (int i = 0; i < clientes.getLength(); i++) {
            Element elemento = (Element) clientes.item(i);
            System.out.println(elemento.getNodeName() + " " + (i + 1));

            System.out.println("Nombre: "
                    + elemento.getElementsByTagName("nombre").item(0).getChildNodes().item(0).getNodeValue());

            System.out.println("Apellidos: "
                    + elemento.getElementsByTagName("apellidos").item(0).getChildNodes().item(0).getNodeValue());

            System.out.println("Nif: "
                    + elemento.getElementsByTagName("nif").item(0).getChildNodes().item(0).getNodeValue());

            System.out.println("Email: "
                    + elemento.getElementsByTagName("email").item(0).getChildNodes().item(0).getNodeValue());

            System.out.println(" ");
        }

    }
}
