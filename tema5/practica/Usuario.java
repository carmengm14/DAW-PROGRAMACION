import java.util.ArrayList;

public class Usuario {
    //atributos
    private int id;
    private String email;
    private String password;
    ArrayList<Usuario> UsuariosNuevos = new ArrayList<Usuario>();

    //constructor
    public Usuario(int id, String email, String password){
        this.id = id;
        this.email = email;
        this.password = password;
        UsuariosNuevos.add(this);
    }
    //getters
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}
