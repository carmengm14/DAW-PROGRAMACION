import java.awt.Point;
/** Crearemos una clase llamada Silla que no tendra main, no es ejecutable directamente, tendrá atributos: color, numero de patas, si tiene respaldo o no, comodidad del 0 al 10 y material, la clase silla tiene una localizacion de x e y, para saber donde estan. Tendremos que definir todos los atributos como privados pero desde la clase de prueba se podran modificar y acceder a su valor. En la clase de test creamos 100 sillas de manera aleatoria. */

class Silla {
    //CREAMOS LOS ATRIBUTOS

    private String color;
    private int nPatas;
    private String respaldo;
    private int comodidad;
    private String material;

    public Silla(String colorS, int nPatasS, String respaldoS, int comodidadS, String materialS ) {
        color = colorS;
        nPatas= nPatasS;
        respaldo= respaldoS;
        comodidad = comodidadS;
        material = materialS;

    }
    public static void localizacion (Point p) {

        System.out.println ("(" + p.x + "," + p.y + ")");
    
    }
}
