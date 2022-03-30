package src.Character.Job;

import src.Character.Stat.Stat;

public abstract class Jobs {
    //METODOS
    
    //Devuelve el modificador de la profesión segun el stat
    public abstract int modifier(Stat stat);

    @Override
    //Devuelve true si son la misma clase
    public boolean equals(Object obj){
       /* if (obj.getClass().getSimpleName() == toString()) {
            return true;
        }else{
            return false;
        }
        */
        return getClass().getName().equals(obj.getClass().getName());
    }
    @Override
    //Devuelve el nombre simple de la clase
    public String toString(){
        return getClass().getSimpleName();
    }
}
