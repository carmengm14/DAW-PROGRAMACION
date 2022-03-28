package src.Character;

import src.Character.Job.Jobs;
import src.Character.Race.Race;
import src.Character.Stat.Constitucion;
import src.Character.Stat.Destreza;
import src.Character.Stat.Fuerza;
import src.Character.Stat.Inteligencia;
import src.Character.Stat.Stat;

public class Personaje{
    //ATRIBUTOS
    private String nombre;
    private Jobs trabajo;
    private Race raza;
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
        double velocidad = (destreza.getValue() + raza.modifier(destreza) + trabajo.modifier(destreza))+2;
        return velocidad;
    }
    //valor base poder + bonif. raza + bonif. trabajo + 2
    public double poder(){
        double poder = (fuerza.getValue() + raza.modifier(fuerza) + trabajo.modifier(fuerza))+2;
        return poder;
    }
     //valor base inteligencia + bonif. raza + bonif. trabajo + 2
     public double magia(){
        double magia = (inteligencia.getValue() + raza.modifier(inteligencia) + trabajo.modifier(inteligencia))+2;
        return magia;
    }
}
