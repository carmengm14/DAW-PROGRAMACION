package src.Character;

import src.Character.Job.Jobs;
import src.Character.Race.Race;
import src.Character.Stat.Fuerza;
import src.Character.Stat.Stat;

public class Personaje {
    //ATRIBUTOS
    private String nombre;
    private Jobs trabajo;
    private Race raza;

    //Constructor
    public Personaje(String nombre, Jobs trabajo, Race raza) {
        this.nombre = nombre;
        this.trabajo = trabajo;
        this.raza = raza;
        
    }    
}
