package src.Character.Race;

import src.Character.Stat.Constitucion;
import src.Character.Stat.Destreza;
import src.Character.Stat.Inteligencia;
import src.Character.Stat.Stat;

public class Elfo extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitucion) {
            return -1;
        }
        if (stat instanceof Destreza) {
            return 3;
        }
        if (stat instanceof Inteligencia) {
            return 3;
        }
        else{
            return 0;
        }
    }
    
}
