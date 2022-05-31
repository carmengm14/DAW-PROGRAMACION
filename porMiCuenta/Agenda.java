public class Agenda {
    // ATRIBUTOS
    Contacto[] listaContactos;
    static int contadorContactos = 0;

    // CONTRUCTORES
    // CONTRUCTOR TAMAÑO DEFINIDO
    public Agenda() {
        listaContactos = new Contacto[10];
    }

    // CONSTRUCTOR TAMAÑO NO DEFINIDO
    public Agenda(int tamanyo) {
        listaContactos = new Contacto[tamanyo];
    }
    // METODOS

    // AÑADIR CONTACTO
    public void anyadirContacto(Contacto contacto) {
        boolean encontrado = false;
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] == null) {
                listaContactos[i] = contacto;
                encontrado = true;
            }
        }
        if(encontrado){
            System.out.println("CONTACTO AÑADIDO");
        }else{
            System.out.println("NO SE HA AÑADIDO EL CONTACTO");
        }
    }

    // CONTACTO EXISTENTE
    public void contactoExistente(String nombre) {
        boolean respuesta = false;
        try {
            for (int i = 0; i < listaContactos.length; i++) {
                if (listaContactos[i].getNombre() == nombre) {
                    respuesta = true;
                } else {
                    respuesta = false;
                }
            }

            if (respuesta == true) {
                System.out.println("EL CONTACTO EXISTE");
            }else{
                System.out.println("EL CONTACTO NO EXISTE");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getMessage());
        }

    }

    // LISTAR AGENDA
    public void listarAgenda() {
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] != null) {
                System.out.println(listaContactos[i]);
            }
        }
    }

    // BUSCAR CONTACTO
    public void buscarContacto(String nombreContacto) {
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i].getNombre() == (nombreContacto)) {
                System.out.println(listaContactos[i].getNombre() + " " + listaContactos[i].getTelefono());
            } else {
                System.out.println("NO SE HA ENCONTRADO ESTE CONTACTO");
            }
        }
    }

    // AGENDA LLENA

    public boolean agendaLlena(Agenda agenda){
        if (agenda.listaContactos.length > 10) {
            return false;
        }else{
            return true;
        }
    }

    // HUECOS LIBRES EN LA AGENDA
    public int huecosLibres() {
        int contador = 0;
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] == null) {
                contador++;
            }
        }
        return contador;
    }

    // ELIMINAR UN CONTACTO
    public void eliminarContacto(Contacto contacto) {
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] == contacto) {
                listaContactos[i] = null;
            }
        }
    }
}
