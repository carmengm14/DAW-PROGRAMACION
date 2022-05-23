import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    //Atributos
    String nombre, apellidos, email;
    int telefono;
    public static ArrayList contactos = new ArrayList<String>();

    //Constructor user pedido por terminal
        public Agenda(String nombre, String apellidos, String email, int telefono) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.email = email;
            this.telefono = telefono;
            contactos.add(this);
        }
    //CONSTRUCTOR MANUAL
        public Agenda() {
            this.nombre = "CambiarLuego";
            this.apellidos = "CambiarLuego";
            this.email = "CambiarLuego";
            this.telefono = 000000000;
        }
    
        //METODOS
        
        public void pedirUsuarios() {
            
        }
        public void imprimirListadoTexto() {
            
        }
    
        public void imprimirListadoObjetos() {
            
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

        //MAIN
        public static void main(String[] args) {
            //Le pedimos al usuario sus datos
            Scanner sc = new Scanner(System.in);
            System.out.print("Registrar Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Registrar Apellidos: ");
            String apellidos = sc.nextLine();
            System.out.print("Registrar Email: ");
            String email = sc.nextLine();
            System.out.print("Registrar Telefono: ");
            int telefono = sc.nextInt();
            sc.close();
    
            Agenda contacto = new Agenda(nombre,apellidos,email,telefono);
            contacto.pedirUsuarios();
        }
    
    }