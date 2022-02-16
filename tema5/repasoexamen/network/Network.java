import java.util.ArrayList;

class Network {
    //Aqui estan todas las publicaciones de la red social
    private ArrayList<Mensaje> publiMensajes;

    //Constructor
    public Network(){
        this.publiMensajes = new ArrayList<Mensaje>();
    }
    //metodos
    public void subirMensaje(){
        Mensaje mensaje = new Mensaje(nomUser, textMens, fecha);
    }
}
