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
            File ficheroSalida = new File("controles/controlAgenda/agenda.dat");
            FileWriter writer = new FileWriter(ficheroSalida);
     
        for (int i = 3; i <= 500; i++) {
            if (esPrimo(i) == true) {
                //cambiamos los numeros de int a string ya que sino el metodo write no los reconoce y saldran caracteres raros en el fichero
                writer.write(i + "\n");
                
            }
        }
        writer.close();
        }
        public void pedirUsuarios() {
            
        }
        public void imprimirListadoTexto() {
            
        }
    
        public void imprimirListadoObjetos() {
            
        }
    }