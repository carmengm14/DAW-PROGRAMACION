package src.Character.Job;

import src.Character.Stat.Destreza;
import src.Character.Stat.Inteligencia;
import src.Character.Stat.Stat;

public class Mago extends Jobs{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;
        
        if (stat instanceof Inteligencia){
            resultado = 4;
        }else if (stat instanceof Destreza){
            resultado = 1;
        }
        
        return resultado;
    }
    
}
