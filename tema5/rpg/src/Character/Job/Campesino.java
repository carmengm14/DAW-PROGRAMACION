package src.Character.Job;

import src.Character.Stat.Constitucion;
import src.Character.Stat.Fuerza;
import src.Character.Stat.Stat;

public class Campesino extends Jobs{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;
        
        if (stat instanceof Constitucion){
            resultado = 3;
        }else if (stat instanceof Fuerza){
            resultado = 2;
        }
        
        return resultado;
    }
    
}