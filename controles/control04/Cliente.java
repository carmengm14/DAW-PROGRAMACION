/*import java.util.ArrayList;
import java.util.List;*/

public class Cliente extends Persona {
    //Atrbutos
    private int id;
  //  protected List<Integer> numeros = new ArrayList<>();
    private String email;

    //constructor
    public Cliente(String nombre, String apellidos, String nif, int id, String email) {
        super(nombre, apellidos, nif);
        //TODO Auto-generated constructor stub
      /*  for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == id) {
                System.out.println("Id no disponible");
            }else{
                numeros.add(id);
                this.id = id;
            }
        }
        */
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
