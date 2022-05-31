public class Ciudadano extends Persona {
    String nombre;
   
    public Ciudadano(String dni, String nombre) {
        super(dni);
        //TODO Auto-generated constructor stub
        this.nombre = nombre;
    }

    public String descripcion(){
        return super.descripcion() + " y mi nombre es = " + this.nombre;
    }

    public static void main(String[] args) {
        Ciudadano ciudadano = new Ciudadano("20919180J", "Carmen");
        System.out.println( ciudadano.descripcion());
    }
}
