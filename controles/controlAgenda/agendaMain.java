import java.util.Scanner;

public class agendaMain{
    public static void main(String[] args) {
        //Le pedimos al usuario sus datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Registrar Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Registrar Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.println("Registrar Email: ");
        String email = sc.nextLine();
        System.out.println("Registrar Telefono: ");
        int telefono = sc.nextInt();
        sc.close();

        Agenda contacto = new Agenda();
        contacto.Agenda(nombre,apellidos,email,telefono);
    }

}