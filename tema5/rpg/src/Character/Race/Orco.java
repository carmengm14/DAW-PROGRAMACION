package src.Character.Race;

import src.Character.Stat.Constitucion;
import src.Character.Stat.Fuerza;
import src.Character.Stat.Inteligencia;
import src.Character.Stat.Stat;

public class Orco extends Race{

    @Override
    public int modifier(Stat stat) {
        int resultado = 0;
        if (stat instanceof Constitucion) {
            resultado = 3;
        }
        if (stat instanceof Fuerza) {
            resultado = 5;
        }
        if (stat instanceof Inteligencia) {
            resultado = -3;
        }
        return resultado;
    }
}
