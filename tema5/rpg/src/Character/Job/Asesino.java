package src.Character.Job;

import src.Character.Stat.Constitucion;
import src.Character.Stat.Destreza;
import src.Character.Stat.Fuerza;
import src.Character.Stat.Stat;

public class Asesino extends Jobs{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitucion) {
            return 1;
        }
        if (stat instanceof Fuerza) {
            return 1;
        }
        if (stat instanceof Destreza) {
            return 3;
        }
        else{
            return 0;
        }
    }
    
}
