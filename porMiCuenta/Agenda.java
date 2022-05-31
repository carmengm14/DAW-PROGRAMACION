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
        if (tamanyo >= 0 || tamanyo <= 10) {
            listaContactos = new Contacto[tamanyo];
        } else {
            System.out.println("Tamaño menor que 0 no permitido");
        }

    }
    // METODOS

    // AÑADIR CONTACTO
    public boolean anyadirContacto(Contacto contacto) {
        if(contadorContactos >= 10){
            return false;
        }else{
            listaContactos[contadorContactos] = contacto;
            contadorContactos ++;
            return true;
        }
    }

    // CONTACTO EXISTENTE
    public void contactoExistente(Contacto contacto) {
        boolean respuesta = false;
        try {
            for (int i = 0; i < contadorContactos; i++) {
                if (listaContactos[i].equals(contacto)) {
                    respuesta = true;
                } else {
                    respuesta = false;
                }
            }

            if (respuesta == true) {
                System.out.println("EL CONTACTO EXISTE");
            } else {
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
    public boolean buscarContacto(Contacto contacto) {
        boolean existe = false;
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i].equals(contacto)) {
                existe = true;
                return existe;
            }
        }
        return existe;
    }

    // AGENDA LLENA

    public boolean agendaLlena(Agenda agenda) {
        if (agenda.listaContactos.length > 10) {
            return false;
        } else {
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
       
    }
}
