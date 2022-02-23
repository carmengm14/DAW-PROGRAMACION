public class Usuario {
    //atributos
    private int id;
    private String email;
    private String password;

    //constructor
    public Usuario(int id, String email, String password){
        this.id = id;
        this.email = email;
        this.password = password;
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
