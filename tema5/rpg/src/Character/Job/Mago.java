package src.Character.Job;

import src.Character.Stat.Destreza;
import src.Character.Stat.Inteligencia;
import src.Character.Stat.Stat;

public class Mago extends Jobs{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Inteligencia) {
            return 4;
        }
        if (stat instanceof Destreza) {
            return 1;
        }
        else{
            return 0;
        }
    }
    
}
