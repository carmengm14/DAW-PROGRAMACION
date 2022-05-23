import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Agenda implements Serializable {
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
        public String toString(){
            String linea = " ";
            linea += "Nombre = " + getNombre() + "\t\t" + "Apellidos = " + getApellidos() + "\t" + "Email = " + getEmail() + "\t"+ "Telefono = " + getTelefono() + "." + "\n";
            return linea;
        }
        
        public void escribirFichero() throws IOException{
            BufferedWriter bw = null;
            File file = new File("Agenda.dat");
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            bw = new BufferedWriter(fw);
                bw.write(toString());
            bw.close();
        }

        public void escribirObjetos() throws IOException{
            File file = new File("AgendaObjetos.dat");
            if(!file.exists()){
                file.createNewFile();
            }
            try (DataOutputStream writer = new DataOutputStream(
                new FileOutputStream(file));
                ObjectOutputStream salida = new ObjectOutputStream(writer)){
                    salida.writeObject(getNombre() + getApellidos() + getEmail() + getTelefono());
                    writer.close();
            } catch (Exception e) {
            // TODO: handle exception
            }
        }

        public void listarAgenda() throws IOException{
            System.out.println("================");
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
        public void listarObjetos() throws IOException, ClassNotFoundException{
            System.out.println("================");
            DataInputStream f = new DataInputStream(new FileInputStream(
                "AgendaObjetos.dat"));
        ObjectInputStream entrada = new ObjectInputStream(f);

        while (f.available() > 0) {
            System.out.println(entrada.readObject());
        }
        f.close();
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
               contacto.escribirObjetos();
               contacto.listarObjetos();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e.getLocalizedMessage());
            }

        }
    
    }