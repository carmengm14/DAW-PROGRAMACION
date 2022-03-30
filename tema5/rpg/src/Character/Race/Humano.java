package src.Character.Race;

import src.Character.Stat.Constitucion;
import src.Character.Stat.Destreza;
import src.Character.Stat.Fuerza;
import src.Character.Stat.Stat;

public class Humano extends Race{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;
        
        if (stat instanceof Fuerza){
            resultado = 2;
        }else if (stat instanceof Constitucion){
            resultado = 2;
        }else if (stat instanceof Destreza){
            resultado = 1;
        }
        
        return resultado;
    }
    
}
