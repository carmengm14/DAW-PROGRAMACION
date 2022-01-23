import java.awt.Point;
/** Crearemos una clase llamada Silla que no tendra main, no es ejecutable directamente, tendrá atributos: color, numero de patas, si tiene respaldo o no, comodidad del 0 al 10 y material, la clase silla tiene una localizacion de x e y, para saber donde estan. Tendremos que definir todos los atributos como privados pero desde la clase de prueba se podran modificar y acceder a su valor. En la clase de test creamos 100 sillas de manera aleatoria. */

class Silla {
    //CREAMOS LOS ATRIBUTOS

    private String color;
    private int nPatas;
    private boolean respaldo;
    private int comodidad;
    private String material;
    private Point localizacion;

    public Silla(String colorS, int nPatasS, boolean respaldoS, int comodidadS, String materialS, int x, int y ) {
        color = colorS;
        nPatas= nPatasS;
        respaldo = respaldoS;
        comodidad = comodidadS;
        material = materialS;
        localizacion = new Point(x, y);
        
    }

    public void setColor(String col){
        color = col;
    }
       

    public void imprimeSilla(){
        String tieneRespaldo;
        if (respaldo == true) {
            tieneRespaldo = "si";
        }else{
            tieneRespaldo = "no";
        }
        System.out.println("Atributos Silla: Color:" + color + "\tNº Patas: " + nPatas + "\tRespaldo: " + tieneRespaldo + "\tComodidad: " + comodidad + "\tMaterial: " + material + "\tLocalizacion: " + "(" + localizacion.getX() + "," + localizacion.getY()+")");
    }
    
}
