import java.awt.Point;

public class Forma {
    private String color;
    private Point centro;
    private String nombre;
//constructor
    public Forma(String color,int x, int y, String nombre) {
        this.color = color;
        this.centro = new Point(x,y);
        this.nombre = nombre;
    }
//funciones
    public void imprimir(){
        System.out.println("Color: " + color );
        System.out.println("Centro: (" + centro.x + "," + centro.y + ")");
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
        this.centro = new Point(x,y);
    }
}
