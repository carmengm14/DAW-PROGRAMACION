import java.awt.Point;

public class Forma {
    private String color;
    private Point centro;
    private String nombre;

    public Forma(String color,int x, int y, String nombre) {
        this.color = color;
        this.centro = new Point(x,y);
        this.nombre = nombre;
    }
    
    public void Imprimir(){
        System.out.println("Color: " + color );
        System.out.printf("Centro: (%d, %d)\n " + centro.x, centro.y);
        System.out.println("Nombre: " + nombre);
    }

    //getters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mover(int x, int y){
        this.centro.x = x;
        this.centro.y = y;
    }
}
