import java.util.ArrayList;
import java.util.Iterator;

public class Media implements ParserXML{
    //atributos
    private String nombre;
    private String contenido;
    //el tipo es decir si es audio, video o imagen.
    private MediaType tipo;
    private int usuarioId;

    public static ArrayList<Media> list = new ArrayList<>();

   
    //constructor
    public Media(String nombre, String contenido, MediaType tipo, int usuarioId) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuarioId = usuarioId;
    }
    //getters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public MediaType getTipo() {
        return tipo;
    }
    public void setTipo(MediaType tipo) {
        this.tipo = tipo;
    }
    public int getUsuarioId() {
        return usuarioId;
    }
    //metodos
    private boolean comprobarNombre(String nombre){
        boolean resultado = true;
        for (Media media : list) {
            if(nombre.equals(media.getNombre())){
                resultado = false;
                break;
            }
        }
        return resultado;
    }
    //1- eliminar UN media de la lista 
    public static void eliminarMedia(String nombre){
        for (Media media : list) {
            if(media.nombre.equals(nombre)){
                list.remove(media);
                break;
            }
        }
    }
     //2- eliminarTODO media DE UN TIPO 
     public void eliminarTodosMedia(MediaType tipos){
        /** UN ITERADOR ES UN OBJETO QUE RECORRE COLECCIONES COMO EL ARRAYLIST, ASI SE CREA UN ITERADOR Y LO RECORREMOS */
        Iterator<Media> iterator = list.iterator();
        //** list.iterator es lo que llama al metodo iterador que esta en la clase Iterator y queremos llamarlo en Media */
        while (iterator.hasNext()) {
            //el .hasNext() es para decir que mientras haya un siguiente objeto en el iterador siga haciendo lo de dentro de este.
            Media elemento = iterator.next();

            if (elemento.tipo == tipos) {
                list.remove(elemento);
            }
        }
        
        /*
        CON UN FOREACH DA ERROR ya que cuando se elimina el media de un user el array se disminuye y queremos que no lo haga, PERO SERIA ASI
        for (Media media : list) {
            if(media.tipo.equals(tipos)){
                list.remove(media);
            }
        }
        */
    }

    //eliminarTODO media DE UN USUARIO 
    public static void eliminarMediaUser(int identidicador){
        for (Media media : list) {
            if(media.usuarioId == identidicador){
                list.remove(media);
            }
        }
    }
    //PARA LA INTERFAZ ParserXML
    public String generateXML(){
        //imprimimos los datos del media
        String resultado = "";
        resultado += "<Media>\n";
        resultado += "\t<nombre> " +this.nombre + "</nombre>\n";
        resultado += "\t<contenido> " +this.contenido + "</contenido>\n";
        resultado += "\t<tipo> " +this.tipo + "</tipo>\n";
        resultado += "\t<usuarioId> " +this.usuarioId + "</usuarioId>\n";
        resultado += "</Media>\n";
        return resultado;
    }
}