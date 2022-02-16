import java.util.ArrayList;

class Mensaje {
    //ATRIBUTOS
    private String nomUser;
    private String textMens;
    private String fecha;
    private int numMg;
    private ArrayList<String> comentarios;
    
    //CONSTRUCTOR
    public Mensaje(String nomUser, String textMens, String fecha){
        this.nomUser = nomUser;
        this.textMens = textMens;
        this.fecha = fecha;
        //iniamos los mg a 0 ya que al publicar no hay me gustas
        this.numMg = 0;
        //Creamos un arraylist vacio para los comentarios ya que al publicar al principio no hay coments
        this.comentarios = new ArrayList<String>();
    }
    //Getters and setters

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getTextMens() {
        return textMens;
    }

    public void setTextMens(String textMens) {
        this.textMens = textMens;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumMg() {
        return numMg;
    }

    public void setNumMg(int numMg) {
        this.numMg = numMg;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    //METODOS.
    


}
