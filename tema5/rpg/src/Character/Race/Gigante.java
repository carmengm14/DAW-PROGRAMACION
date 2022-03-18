package src.Character.Race;

import src.Character.Stat.Constitucion;
import src.Character.Stat.Destreza;
import src.Character.Stat.Fuerza;
import src.Character.Stat.Stat;

public class Gigante extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitucion) {
            return 4;
        }
        if (stat instanceof Destreza) {
            return -2;
        }
        if (stat instanceof Fuerza) {
            return 3;
        }
        else{
            return 0;
        }
    }
    
}
