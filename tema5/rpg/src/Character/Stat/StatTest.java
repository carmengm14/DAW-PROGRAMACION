package src.Character.Stat;

import org.junit.Test;

public class StatTest {
    @Test
    public void testDecrease() {
         Stat prueba = new Stat(5);
         prueba.decrease();
    }

    @Test
    public void testGetValue() {
        Stat prueba = new Stat(5);
        prueba.getValue();
    }

    @Test
    public void testIncrease() {
        Stat prueba = new Stat(5);
        prueba.increase();
    }

    @Test
    public void testToString() {
        Stat prueba = new Stat(5);
        prueba.toString();
    }

    public static void main (String[] args)
{
   StatTest cosas = new StatTest();
   cosas.testDecrease();
   cosas.testIncrease();
   cosas.testToString();
   cosas.testGetValue();

}
}
