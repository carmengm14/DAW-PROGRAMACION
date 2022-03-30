package src.Character.Job;

import src.Character.Stat.Constitucion;
import src.Character.Stat.Fuerza;
import src.Character.Stat.Stat;

public class Guerrero extends Jobs{

    @Override
    public int modifier(Stat stat) {

        int resultado = 0;
        
        if (stat instanceof Fuerza){
            resultado = 3;
        }else if (stat instanceof Constitucion){
            resultado = 2;
        }
        
        return resultado;
    }
    
}
