/**
 * Nos piden realizar una agenda telefónica de contactos.
 * Un contacto está definido por un nombre y un teléfono (No es necesario de
 * validar). Un contacto es igual a otro cuando sus nombres son iguales.
 * Una agenda de contactos está formada por un conjunto de contactos (Piensa en
 * que tipo puede ser)
 * Se podrá crear de dos formas, indicándoles nosotros el tamaño o con un tamaño
 * por defecto (10)
 * Los métodos de la agenda serán los siguientes:
 * 
 * • añadirContacto(Contacto c): Añade un contacto a la agenda, sino se pueden
 * meter más a la agenda se indicara por pantalla. No se pueden meter contactos
 * que existan, es decir, no podemos duplicar nombres, aunque tengan distinto
 * teléfono.
 * • existeContacto(Conctacto c): indica si el contacto pasado existe o no.
 * • listarContactos(): Lista toda la agenda
 * • buscaContacto(String nombre): busca un contacto por su nombre y muestra su
 * teléfono.
 * • eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si
 * se ha eliminado o no por pantalla
 * • agendaLlena(): indica si la agenda está llena.
 * • huecosLibres(): indica cuantos contactos más podemos meter.
 * Crea un menú con opciones por consola para probar todas estas
 * funcionalidades.
 */

public class Contacto {
    // ATRIBUTOS
    protected String nombre;
    protected int telefono;

    // CONSTRUCTOR
    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // METODOS
    @Override
    public String toString() {
        return "Nombre =\t" + nombre + "Telefono =\t" + telefono;
    }
    
    public boolean equals(Contacto contacto) {
        if (contacto.getNombre().toLowerCase().equals(this.nombre.toLowerCase())) {
            return true;
        } 
            return false;
    }
}