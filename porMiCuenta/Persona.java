public class Persona {
    String dni;

    public Persona(String dni){
        this.dni = dni;
    }

    public String descripcion(){
        return "Soy una persona con DNI = " + this.dni; 
    }
}
