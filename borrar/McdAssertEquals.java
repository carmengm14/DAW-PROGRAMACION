package borrar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class McdAssertEquals {
    
        private int dividendo;
        private int divisor;
    
    
        public Mcd (int  dividendo, int divisor){
            this.dividendo =  dividendo;
            this.divisor = divisor;
        }
    
        public void imprimirMcd(){
            System.out.println("El máximo comun divisor es " + maximoComunDivisor(this.dividendo, this.divisor));
        }
    
    
        public static int maximoComunDivisor(int dividendo, int divisor) {
            int temporal;//Para no perder DIVISOR
            while (divisor != 0) {
                temporal = divisor;
                divisor = dividendo % divisor;
                dividendo = temporal;
            }
            return dividendo;
        }
        //getters y setters
        public int getDividendo() {
            return  dividendo;
        }
    
        public void setDividendo(int dividendo) {
            this.dividendo =  dividendo;
        }
    
        public int getDivisor() {
            return divisor;
        }
    
        public void setDivisor(int divisor) {
            this.divisor = divisor;
        }
    
        public static void prueba1(){
            Assertions.assertTrue(8 == Mcd.maximoComunDivisor(72,16));
        }
        public static void prueba2 (){
    
            Assertions.assertFalse(4 == Mcd.maximoComunDivisor(72,16));
        }
}

