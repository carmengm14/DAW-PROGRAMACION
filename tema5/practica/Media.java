public class Media {
    //atributos
    private String nombre;
    private String contenido;
    //el tipo es decir si es audio, video o imagen.
    private String tipo;
    private String usuarioId;

    //constructor
    public Media(String nombre, String contenido, String tipo, String usuarioId) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuarioId = usuarioId;
    }
    //getters
    public String getNombre() {
        return nombre;
    }
    public String getContenido() {
        return contenido;
    }
    public String getTipo() {
        return tipo;
    }
    public String getUsuarioId() {
        return usuarioId;
    }
}
