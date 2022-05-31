import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class leerPrueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe la ruta del fichero que quieres visualizar = ");
        String nombreFichero = sc.nextLine();

        String dni, nombre;
        int edad;
        double expectativaSalarial;

        try (DataInputStream lector = new DataInputStream(new FileInputStream(nombreFichero))) {
            int finalFich = lector.readInt();

            while (finalFich != -1) {
                dni = lector.readUTF();
                System.out.print("DNI: " + dni);
                nombre = lector.readUTF();
                System.out.print(" Nombre: " + nombre);
                edad = lector.readInt();
                System.out.print(" Edad: " + edad);
                expectativaSalarial = lector.readDouble();
                System.out.println(" Expectativa Salarial: " + expectativaSalarial);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getLocalizedMessage());
        }

        sc.close();
    }
}
