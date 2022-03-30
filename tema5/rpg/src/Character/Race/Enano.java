package src.Character.Race;

import src.Character.Stat.Constitucion;
import src.Character.Stat.Destreza;
import src.Character.Stat.Inteligencia;
import src.Character.Stat.Stat;

public class Enano extends Race{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;
        if (stat instanceof Constitucion) {
            resultado = -2;
        }else if (stat instanceof Destreza) {
            resultado = 3;
        }else if (stat instanceof Inteligencia) {
            resultado = 4;
        }
        return resultado;
    }
    
}

