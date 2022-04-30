
public class Cliente extends Persona {
    //Atrbutos
    private int id;
    private String email;

    //constructor
    public Cliente(String nombre, String apellidos, String nif, int id, String email) {
        super(nombre, apellidos, nif);
        //TODO Auto-generated constructor stub
        this.id = id;
        this.email = email;
    }

    //getters and setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //metodos
    public String toString(){
        String resultado = "";
        resultado += "Nombre:\t\t" + getNombre() + "\n";
        resultado += "Apellidos:\t" + getApellidos() + "\n";
        resultado += "NIF:\t\t" + getNif() + "\n";
        resultado += "ID:\t\t" + getId() + "\n";
        resultado += "Email:\t\t" + getEmail() + "\n";
        resultado += "====================";

        return resultado;
    }

}
