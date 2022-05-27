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
import java.util.Scanner;

public class Agenda {
    Scanner lector;
    //lector
    public Agenda(){
        this.lector = new Scanner(System.in);
    }
     //rellenar el constructor vacio
     public Usuario pedirUser(){
         Usuario nuevoUser = new Usuario();
         System.out.print("Nombre: ");
         nuevoUser.setNombre(lector.nextLine());
         System.out.print("Apellidos: ");
         nuevoUser.setApellidos(lector.nextLine());
         System.out.print("Email: ");
         nuevoUser.setEmail(lector.nextLine());
         System.out.print("Telefono: ");
         nuevoUser.setTelefono(lector.nextInt());
        return nuevoUser;
     }
    
        //METODO
        
        public void escribirFichero(Usuario usuario) throws IOException{
            BufferedWriter bw = null;
            File file = new File("Agenda.dat");
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            bw = new BufferedWriter(fw);
                bw.write(usuario.toString());
            bw.close();
        }

        public void escribirObjetos(Usuario contacto) throws IOException{
            File file = new File("AgendaObjetos.dat");
            if(!file.exists()){
                file.createNewFile();
            }
            try (DataOutputStream writer = new DataOutputStream(
                new FileOutputStream(file));
                ObjectOutputStream salida = new ObjectOutputStream(writer)){
                        salida.writeObject(contacto);   
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
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(
            "AgendaObjetos.dat"));
            Usuario user = (Usuario) entrada.readObject();
            while (user != null) {
                try {
                    System.out.println(user.getNombre() + ", " + 
                                        user.getApellidos() + ", " +
                                        user.getEmail() + ", " +
                                        user.getTelefono() );
                    entrada.readObject();
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println(e.getLocalizedMessage());
                }
                entrada.close();

            } 
        }
        

        //MAIN
        public static void main(String[] args) {
            try {
            //Le pedimos al usuario sus datos
            System.out.println("================");
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
    
            Agenda agenda = new Agenda();
            Usuario contacto = new Usuario(nombre,apellidos,email,telefono);
            
            agenda.escribirFichero(contacto);
            agenda.listarAgenda();
            agenda.escribirObjetos(contacto);
            agenda.listarObjetos();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e.getLocalizedMessage());
            }

        }
    
    }