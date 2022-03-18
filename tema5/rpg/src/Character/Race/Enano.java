package src.Character.Race;

import src.Character.Stat.Constitucion;
import src.Character.Stat.Destreza;
import src.Character.Stat.Inteligencia;
import src.Character.Stat.Stat;

public class Enano extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitucion) {
            return -2;
        }
        if (stat instanceof Destreza) {
            return 3;
        }
        if (stat instanceof Inteligencia) {
            return 4;
        }
        else{
            return 0;
        }
    }
    
}

