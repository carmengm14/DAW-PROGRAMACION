import java.util.Scanner;

public class testEjer1 {
    // METODO MAIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int respuesta;
        String nombre;
        int telefono;
        boolean salir = true;
        Agenda agendaTelefonica = new Agenda();
        Contacto contacto;
        do {
            System.out.print(
                    "OPCIONES:\n 1- Añadir contacto\n 2- Comprobar si existe un contacto\n 3- Buscar un contacto\n 4- Eliminar un contacto\n 5- Saber cuántos huecos libres quedan\n 6- Salir\n OPCION = ");
            respuesta = sc.nextInt();

            switch (respuesta) {
                case 1:
                    if (agendaTelefonica.agendaLlena(agendaTelefonica) == true) {
                        System.out.print("Nombre = ");
                        nombre = sc2.nextLine();

                        System.out.print("Telefono = ");
                        telefono = sc2.nextInt();

                        contacto = new Contacto(nombre, telefono);
                        agendaTelefonica.anyadirContacto(contacto);
                    }else{
                        System.out.println(agendaTelefonica.agendaLlena(agendaTelefonica));
                    }

                    break;
                case 2:
                    System.out.print("Escribe el nombre del contacto a comprobar= ");
                    nombre = sc2.next();
                    agendaTelefonica.contactoExistente(nombre);
                    break;
                case 3:
                    System.out.print("Escribe el nombre del contacto a buscar = ");
                    nombre = sc2.next();
                    agendaTelefonica.buscarContacto(nombre);
                    break;
                case 4:
                    System.out.print("Escribe el nombre del contacto a eliminar = ");
                    nombre = sc2.next();
                    System.out.print("Escribe el telefono del contacto a eliminar = ");
                    telefono = sc2.nextInt();

                    contacto = new Contacto(nombre, telefono);
                    agendaTelefonica.eliminarContacto(contacto);
                    break;
                case 5:
                    System.out.println(agendaTelefonica.huecosLibres());
                    break;
                case 6:
                    salir = false;
                    break;
                default:
                    System.out.println("NO ES UN NÚMERO PERMITIDO");
                    break;
            }
        } while (salir == true);
        sc.close();
        sc2.close();
    }
}
