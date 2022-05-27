import java.io.Serializable;
public class Usuario implements Serializable{
     //Atributos
     protected String nombre;
    protected String apellidos;
    protected String email;
      protected int telefono;
     //Constructor user pedido por terminal
         public Usuario(String nombre, String apellidos, String email, int telefono) {
             this.nombre = nombre;
             this.apellidos = apellidos;
             this.email = email;
             this.telefono = telefono;
         }
     //CONSTRUCTOR MANUAL
         public Usuario() {
             this.nombre = " ";
             this.apellidos = " ";
             this.email = " ";
             this.telefono = 000000000;
         }

         public String toString(){
            String linea = " ";
            linea += getNombre() + "\t" + getApellidos() + "\t" + getEmail() + "\t" + getTelefono() + "." + "\n";
            return linea;
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
     
}
