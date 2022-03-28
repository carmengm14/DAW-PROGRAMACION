package src.Character;
public interface IDamageable {
    //Valor base Constitution + bonif. raza + bonif.profesion +25
    double maxHealth();
    //Devuelve el valor actual
    double health();
    //Devuelve true si el daño es mayor o igual a la vida
    boolean isDead(int danyo);
    //Aumenta el daño recibido
    void receivesDamage(double amount);
    //Disminuye el daño recibido
    void heals(double amount);
}
