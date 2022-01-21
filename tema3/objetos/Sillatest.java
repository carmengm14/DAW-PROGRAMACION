import java.lang.Math;

public class Sillatest {
    public static void main(String[] args) {
       String[] colores = {"rojo","azul", "naranja","rosa","negro"}; 
       boolean[] respaldos = {true,false};
       
       String[] materiales = {"madera","plastico","acero","hierro"}; 
      
       for(int i = 0; i<100; i++){
            String color = colores[(int) Math.floor(Math.random() * (colores.length))];
            int nPatas = (int) Math.floor(Math.random() * 5);
            boolean respaldo = respaldos[(int) Math.floor(Math.random()*2)];
            int comodidad = (int) Math.floor(Math.random()*11);
            String material = materiales[(int) Math.floor(Math.random() * (materiales.length))];
            int x = (int) Math.floor(Math.random()*50);
            int y = (int) Math.floor(Math.random()*30);

            Silla s = new Silla(color, nPatas, respaldo, comodidad, material, x, y);
            s.imprimeSilla();
       }
    }
}
