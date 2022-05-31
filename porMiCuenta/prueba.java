import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Guarda una serie de datos sobre los candidatos a un puesto de trabajo en un fichero binario. Tenemos que guardar los siguietes atributos: DNI, NOMBRE, EDAD Y EXPECTATIVA SALARIAL */
public class prueba {
    //ATRIBUTOS

    String dni, nombre;
    int edad;
    double expectativaSalarial;

    //MAIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dni, nombre;
        int edad;
        double expectativaSalarial;
        List<prueba> candidatos = new ArrayList<prueba>();

        System.out.print("Escribe tu DNI: ");
        dni = sc.nextLine();

        System.out.print("Escribe tu Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Escribe tu Edad: ");
        edad = sc.nextInt();

        System.out.print("Escribe tu Expectativa Salarial: ");
        expectativaSalarial = sc.nextDouble();

        prueba candidato = new prueba(dni, nombre, edad, expectativaSalarial);

        candidatos.add(candidato);
        candidato.escribirCandidatos(candidatos);

        sc.close();
    }

   //CONSTRUCTOS
    public prueba(String dni, String nombre, int edad, double expectativaSalarial) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.expectativaSalarial = expectativaSalarial;
    }
    //getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getExpectativaSalarial() {
        return expectativaSalarial;
    }

    public void setExpectativaSalarial(double expectativaSalarial) {
        this.expectativaSalarial = expectativaSalarial;
    }


    //METODOS
    public void escribirCandidatos(List<prueba> candidatos){
        try (DataOutputStream escribir = new DataOutputStream(new FileOutputStream("candidatosPrueba.txt", true))){
                for (int i = 0; i < candidatos.size(); i++) {
                    prueba candidato = candidatos.get(i);

                    escribir.writeUTF(candidato.getDni());
                    escribir.writeUTF(candidato.getNombre());
                    escribir.writeInt(candidato.getEdad());
                    escribir.writeDouble(candidato.getExpectativaSalarial());
                }
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getLocalizedMessage());
        }
    }

   
   
    
}

    
