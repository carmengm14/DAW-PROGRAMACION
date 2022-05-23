import java.util.ArrayList;

public class Agenda {
    //Atributos
    String nombre, apellidos, email;
    int telefono;
    static ArrayList contactos = new ArrayList<String>();

    //Constructor user pedido por terminal
        public Agenda(String nombre, String apellidos, String email, int telefono) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.email = email;
            this.telefono = telefono;
            contactos.add(this);
        }
        public Agenda() {
            this.nombre = "CambiarLuego";
            this.apellidos = "CambiarLuego";
            this.email = "CambiarLuego";
            this.telefono = 000000000;
        }
    //GETTERS Y SETTERS
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getApellidos() {
            return apellidos;
        }
        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public int getTelefono() {
            return telefono;
        }
        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
        //CONTINUAMOS CON LOS METODOS
        public void añadirUserAlFich(){
            
        }
        public void pedirUsuarios() {
            
        }
        public void imprimirListadoTexto() {
            
        }
    
        public void imprimirListadoObjetos() {
            
        }
    }
