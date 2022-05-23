import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Agenda {
    //Atributos
    String nombre, apellidos, email;
    int telefono;

    //Constructor user pedido por terminal
        public Agenda(String nombre, String apellidos, String email, int telefono) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.email = email;
            this.telefono = telefono;
        }
    //CONSTRUCTOR MANUAL
        public Agenda() {
            this.nombre = "CambiarLuego";
            this.apellidos = "CambiarLuego";
            this.email = "CambiarLuego";
            this.telefono = 000000000;
        }
    
        //METODOS
        public void escribirFichero() throws IOException{
            BufferedWriter bw = null;
            File file = new File("Agenda.dat");
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            bw = new BufferedWriter(fw);

            String linea = " ";
                linea += "Nombre = " + getNombre() + "\t\t" + "Apellidos = " + getApellidos() + "\t" + "Email = " + getEmail() + "\t"+ "Telefono = " + getTelefono();
                bw.write(linea+ "." + "\n");
            bw.close();
        }

        public void escribirObjetos() throws IOException{
            DataOutputStream writer = new DataOutputStream(
                new FileOutputStream("/home/alumno/Desktop/discoExtra/DAW-PROGRAMACION/controles/controlAgenda/AgendaObjetos.dat"));
                ObjectOutputStream salida = new ObjectOutputStream(writer);
                salida.writeObject(getNombre() + getApellidos() + getEmail() + getTelefono());

            writer.close();
        }
        public void listarAgenda() throws IOException{
            FileReader fileReader = new FileReader(
                "Agenda.dat");
            BufferedReader lectorFich = new BufferedReader(fileReader);
            String cadena = lectorFich.readLine();

            while (cadena != null) {

                String lineaFinal = cadena.trim();

                if (lineaFinal.endsWith(".")) {
                    System.out.println(cadena);
                }

                cadena = lectorFich.readLine();
            }
        lectorFich.close();
        }
        public void listarObjetos() throws IOException{
            
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
            try {
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
            
               contacto.escribirFichero();
               contacto.listarAgenda();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e.getLocalizedMessage());
            }

        }
    
    }