import java.util.ArrayList;

public class Media {
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
    //eliminar UN media de la lista 
    public void eliminarMedia(String nombre){
        for (Media media : list) {
            if(media.nombre.equals(nombre)){
                list.remove(media);
                break;
            }
        }
    }
     //eliminar TODO media DE UN TIPO 
     public void eliminarTodosMedia(MediaType tipo){
        for (Media media : list) {
            if(media.tipo.equals(tipo)){
                list.remove(media);
            }
        }
    }

}