package src.Character.Job;

import src.Character.Stat.Constitucion;
import src.Character.Stat.Fuerza;
import src.Character.Stat.Stat;

public class Campesino extends Jobs{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitucion) {
            return 3;
        }
        if (stat instanceof Fuerza) {
            return 2;
        }
        else{
            return 0;
        }
    }
    
}