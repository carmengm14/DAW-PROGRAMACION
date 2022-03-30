package src.Character;
import src.Character.Job.Jobs;
import src.Character.Race.Race;
import src.Character.Stat.Constitucion;
import src.Character.Stat.Destreza;
import src.Character.Stat.Fuerza;
import src.Character.Stat.Inteligencia;

public class Personaje implements IDamageable{
    //ATRIBUTOS
    private String nombre;
    private Jobs trabajo;
    private Race raza;
    private double health;
    private Fuerza fuerza;
    private Constitucion constitucion;
    private Inteligencia inteligencia;
    private Destreza destreza;

    //Constructor
    public Personaje(String nombre, Jobs trabajo, Race raza, Fuerza fuerza, Constitucion constitucion, Destreza destreza, Inteligencia inteligencia) {
        this.nombre = nombre;
        this.trabajo = trabajo;
        this.raza = raza;
        this.fuerza = fuerza;
        this.constitucion = constitucion;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        
    }
 
    //Getters 
    public String getNombre() {
        return nombre;
    }
    public Jobs getTrabajo() {
        return trabajo;
    }
    public Race getRaza() {
        return raza;
    }
    
    //METODOS
    //valor base destreza + bonif. raza + bonif. trabajo + 2
    public double velocity(){
        double velocidad = (destreza.getValue() + raza.modifier(destreza) + trabajo.modifier(destreza))*2.0f;
        return velocidad;
    }
    //valor base poder + bonif. raza + bonif. trabajo + 2
    public double poder(){
        double poder = (fuerza.getValue() + raza.modifier(fuerza) + trabajo.modifier(fuerza))*2.0f;
        return poder;
    }
     //valor base inteligencia + bonif. raza + bonif. trabajo + 2
     public double magia(){
        double magia = (inteligencia.getValue() + raza.modifier(inteligencia) + trabajo.modifier(inteligencia))*2.0f;
        return magia;
    }

    @Override
    //Muestra toda la informacion de un personaje
    public String toString(){
        String personaje = "";
        personaje += "Personaje:\n";
        personaje += "My name is " + nombre + ". I'm an " + raza + " " + trabajo;
        personaje += " My stats are, Fuerza " + fuerza.getValue() + " Destreza: "+destreza.getValue() + " Constitucion: "+constitucion.getValue()+ " Inteligencia: "+ inteligencia.getValue() + " Velocidad: " + velocity() + " Poder: " + poder()+ " Magia: " + magia();
        return  personaje;
    }

    //Valor base Constitution + bonif. raza + bonif.profesion +25
    @Override
    public double maxHealth() {
        // TODO Auto-generated method stub
        double salud = (constitucion.getValue() + raza.modifier(constitucion) + trabajo.modifier(constitucion))*25.0f;
        return salud;
    }

    //Devuelve el valor actual
    @Override
    public double health() {
        // TODO Auto-generated method stub
        return health();
    }

    //Devuelve true si el daño es mayor o igual a la vida
    @Override
    public boolean isDead(int danyo) {
        // TODO Auto-generated method stub
       return health() <= 0;
    }

    //Aumenta el daño recibido
    @Override
    public void receivesDamage(double amount) {
        // TODO Auto-generated method stub
        health -= amount;
        if (health < 0){
            health = 0;
        }
        
    }
    //Disminuye el daño recibido
    @Override
    public void heals(double amount) {
        // TODO Auto-generated method stub
        health += amount;
        if (health > maxHealth()) {
            health = maxHealth();
        }        
    }

 /* public static void main(String[] args) {
        Personaje p1 = new Personaje("Caca", new Mago() , new Elfo(), new Fuerza(2), new Constitucion(1), new Destreza(0), new Inteligencia(2));
        System.out.println(p1.toString());
    }
  */
}
