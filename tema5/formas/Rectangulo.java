public class Rectangulo extends Forma {
    private double lmayor;
    private double lmenor;

    //constructor
    public Rectangulo(String color,int x, int y, String nombre, double lmayor, double lmenor){
        super(color, x, y, nombre);
        this.lmayor = lmayor;
        this.lmenor = lmenor;
    }
    //funciones
    public void imprimir(){
        super.imprimir();
        System.out.println("Lado mayor:" + this.lmayor + "\nLado menor:" + this.lmenor);
    }

    public double area(){
        if (this.lmayor > this.lmenor) {
            return lmayor*lmenor;
        }else{
            return lmenor*lmayor;
        }
    }

    public double perimetro(){
        double calculo = (2 * lmenor) + (2 * lmayor);
        return calculo;
    }

    public void cambiarTamaño(double valor){
        this.lmayor = lmayor * valor;
        this.lmenor = lmenor * valor;
    }
}
