import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;


public class Usuario implements ParserXML {
    //atributos
    private int id;
    private static int idGenerator = 1;
    private String email;
    private String password;
    //es un array list static ya que sino lo fuera cada user tendria una lista, y solo queremos una para todos, por esto tmb se inicializa ya al crearla.
    public static ArrayList<Usuario> usuariosNuevos = new ArrayList<Usuario>();

    //constructor
    public Usuario(String email, String password){ 
       
        this.password = password;

        if (this.comprobarEmail(email)){
            this.id = idGenerator++;
            this.email = email;
            usuariosNuevos.add(this);
        }else{
            this.id = -1;
            this.email = "Correo duplicado: " + email;
        }
    }
    //getters

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Usuario> getusuariosNuevos() {
        return usuariosNuevos;
    }
    public void setusuariosNuevos(ArrayList<Usuario> usuariosNuevos) {
        this.usuariosNuevos = usuariosNuevos;
    }

    //metodos
    public boolean comprobarEmail(String email){
        boolean resultado = true;

        for (Usuario usuario : usuariosNuevos) {
            if(email.equals(usuario.getEmail())){
                resultado = false;
                break;
            }
        }

        return resultado;
    } 

    public int comprobarId(int id){
        int error = 0;
        for (int i = 0; i < usuariosNuevos.size(); i++) {
            if (id == usuariosNuevos.get(i).getId()) {
                return error;
            }
        }
        return id;
    }
    //El metodo de julio de comprobarEmail 
    /*
    private boolean isEmailAvaible(String email){
        boolean resultado = true;
        for (Usuario usuario : usuariosNuevos) {
            if(email.equals(email.getEmail())){
                resultado = false;
                break;
            }
        }
        return resultado;
    }
    */
        // 3- eliminar UN usuario mediante el email
        public void eliminarMediaEmail(String gmail){
            for (Usuario email : usuariosNuevos) {
                if(email.getEmail().equals(gmail)){
                    usuariosNuevos.remove(email);
                    Media.eliminarMediaUser(id);
                }
            }
        }
        //eliminar UN usuario de un dominio
        public void eliminarUserDom(String dominio){
            for (Usuario email : usuariosNuevos) {
                if(email.getEmail().contains(dominio)){
                    usuariosNuevos.remove(email);
                }
            }
        }
        //PARA LA INTERFAZ ParserXML
    public String generateXML(){
        //imprimimos los datos del user
        String resultado = "";
        resultado += "<Usuario>\n";
        resultado += "\t<id>" +this.id+ "</id>\n";
        resultado += "\t<email>" +this.email + "</email>\n";
        resultado += "\t<contrasenya>" +this.password + "</contrasenya>\n";
        resultado += "</Usuario>\n";
        return resultado;
    }
    public void writeXML(){
        String datos = generateXML();
        String fileName = "ficheroUsuario"+ this.id +".xml";
        try{
           PrintWriter escribir = new PrintWriter("/home/alumno/Documentos/" + fileName);//para crear el objeto que escribe en el archivo
           //PrintWriter escribir = new PrintWriter("C:/Users/CGM1414/OneDrive/Escritorio/CARMEN/java/" + fileName);
            escribir.println(datos);//para escribir en el archivo
            escribir.flush();
            escribir.close();
            System.out.println("FICHERO CREADO CORRECTAMENTE");
        }
        catch (IOException e){
            System.out.println("NO SE HA PODIDO CREAR EL FICHERO CORRECTAMENTE, ERROR: ");
            e.printStackTrace();
        }
    }

    private static Usuario leerFichero(File xmlfile){
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            Document doc;
            Usuario newUser = null;
    
            try {
                dBuilder = dbFactory.newDocumentBuilder();
                doc = dBuilder.parse(xmlfile);
                String email = doc.getElementsByTagName("email").item(0).getTextContent();
                String password = doc.getElementsByTagName("password").item(0).getTextContent();
                newUser = new Usuario(email, password);
            } catch (ParserConfigurationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SAXParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SAXException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            return newUser;
        }

    }


