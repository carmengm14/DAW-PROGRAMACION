package borrar;

public class Mcd {
   private int dividendo;
   private int divisor;
   
   public Mcd(int dividendoS, int divisorS){
       dividendo = dividendoS;
       divisor = divisorS;
   }
   
   public int calculoMcd(){
    int operacion;
    while (divisor != 0) {
        operacion = divisor;
        divisor = dividendo % divisor;
        dividendo = operacion;
    }
    return dividendo;
    }
}
