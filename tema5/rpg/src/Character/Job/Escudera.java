package src.Character.Job;

import src.Character.Stat.Constitucion;
import src.Character.Stat.Destreza;
import src.Character.Stat.Fuerza;
import src.Character.Stat.Stat;

public class Escudera extends Jobs{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;
        
        if (stat instanceof Fuerza){
            resultado = 1;
        }else if (stat instanceof Constitucion){
            resultado = 1;
        }else if (stat instanceof Destreza){
            resultado = 3;
        }
        return resultado;
       
    }
    
}