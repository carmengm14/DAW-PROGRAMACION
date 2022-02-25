import java.util.ArrayList;

public class Media {
    //atributos
    private String nombre;
    private String contenido;
    //el tipo es decir si es audio, video o imagen.
    private MediaType tipo;
    private int usuarioId;

    public static ArrayList<Media> list = new ArrayList<>();
    private static int idGenerator = 0;

   
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
    private boolean isNameAvaible(String email){
        boolean resultado = true;
        for (Media media : list) {
            if(nombre.equals(media.getNombre())){
                resultado = false;
                break;
            }
        }
        return resultado;
    }
}