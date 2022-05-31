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
        if (listaContactos.length > 10) {
            System.out.println("SOLO PUEDEN HABER 10 USUARIOS EN LA AGENDA");
        } else {
            for (int i = 0; i < listaContactos.length; i++) {
                if (listaContactos[i] != contacto) {
                    for (int j = contadorContactos; j < listaContactos.length; j++) {
                        listaContactos[j] = contacto;
                    }
                    System.out.println("CONTACTO AÑADIDO CORRECTAMENTE");
                }
            }
        }
    }

    // CONTACTO EXISTENTE
    public void contactoExistente(String nombre) {
        try {
            for (int i = 0; i < listaContactos.length; i++) {
                if (listaContactos[i].getNombre() == nombre) {
                    System.out.println("CONTACTO EXISTENTE");
                } else {
                    System.out.println("CONTACTO NO EXISTENTE");
                }
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
