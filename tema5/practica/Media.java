public class Media {
    //atributos
    private String nombre;
    private String contenido;
    //el tipo es decir si es audio, video o imagen.
    private MediaType tipo;
    private int usuarioId;

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

}