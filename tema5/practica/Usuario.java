import java.util.ArrayList;

public class Usuario {
    //atributos
    private int id;
    private int idGenerator = 0;
    private String email;
    private String password;
    //es un array list static ya que sino lo fuera cada user tendria una lista, y solo queremos una para todos, por esto tmb se inicializa ya al crearla.
    public static ArrayList<Usuario> UsuariosNuevos = new ArrayList<Usuario>();

    //constructor
    public Usuario(String email, String password){
        this.id = idGenerator++;
        this.password = password;
            if (comprobarEmail(email) != "Este correo ya existe") {
                this.email = email;
                UsuariosNuevos.add(this);
            }
    }
    //getters

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Usuario> getUsuariosNuevos() {
        return UsuariosNuevos;
    }
    public void setUsuariosNuevos(ArrayList<Usuario> usuariosNuevos) {
        UsuariosNuevos = usuariosNuevos;
    }

    //metodos
    public String comprobarEmail(String email){
        String error = "Este correo ya existe";
        for (int i = 0; i < UsuariosNuevos.size(); i++) {
            if (email.equals(getEmail())) {
                return email;
            }
        }
        return error;
    }
    //El metodo de julio de comprobarEmail 
    /*
    private boolean isEmailAvaible(String email){
        boolean resultado = true;
        for (Usuario usuario : UsuariosNuevos) {
            if(email.equals(email.getEmail())){
                resultado = false;
                break;
            }
        }
        return resultado;
    }
    */
    
}
