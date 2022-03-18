package src.Character.Race;

import src.Character.Stat.Constitucion;
import src.Character.Stat.Fuerza;
import src.Character.Stat.Inteligencia;
import src.Character.Stat.Stat;

public class Orco extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitucion) {
            return 3;
        }
        if (stat instanceof Fuerza) {
            return 5;
        }
        if (stat instanceof Inteligencia) {
            return -3;
        }
        else{
            return 0;
        }
    }
}
