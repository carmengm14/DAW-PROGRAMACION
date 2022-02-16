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
        //iniciamos los mg a 0 ya que al publicar no hay me gustas
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
    public boolean equals(Mensaje otro){
        if (otro.getNomUser().equals(this.getNomUser()) && otro.getNumMg()== this.getNumMg() && otro.getComentarios().equals(this.getComentarios())) {
            return true;
        }else{
            return false;
        }
        /*
        asi tambien se podria hacer:
        return otro.getNomUser().equals(this.getNomUser()) && otro.getNumMg()== this.getNumMg() && otro.getComentarios().equals(this.getComentarios());
        */
    }

    /*  public boolean iguales(ArrayList<String> a1, ArrayList<String> a2){
        if(a1.size() != a2.size()){
            return false;
        }

        for(int i = 0; i<a1.size(); i++){
            if(!a1.get(i).equals(a2.get(i))){
                return false;
            }
        }
        return true;
    }
    */
}
