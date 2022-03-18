public class Elipse extends Forma {
    private double rmayor;
    private double rmenor;

    //constructor
    public Elipse(String color,int x, int y, String nombre, double rmayor, double rmenor){
        super(color, x, y, nombre);
        this.rmayor = rmayor;
        this.rmenor = rmenor;
    }
    //funciones
    public double area(){
        double operacion = Math.PI*(rmayor*rmenor);
        return operacion;
    }
}
