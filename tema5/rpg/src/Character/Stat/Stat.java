package src.Character.Stat;

public abstract class Stat {
    //ATRIBUTOS
    private int value;
    //CONSTRUCTOR
    public Stat(int value) {
        this.value = value;
    }
    //METODOS

    //Devuelve el valor actual de la característica
    public int getValue() {
        return value;
    }
    
    //Aumenta el valor de la caracteristica en 1
    public void increase() {
        this.value = value++;
    }

    //Decrementa el valor de la caracteristica en 1
    public void decrease() {
        this.value = value--;
    }

    @Override
    //Devuelve el nombre simple de la clase
    public String toString(){
        return getClass().getSimpleName();
    }

}
