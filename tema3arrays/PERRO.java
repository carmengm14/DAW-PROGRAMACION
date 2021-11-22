/* explicacion clases y objetos con perros*/
public class PERRO{
    int edad;
    String raza;
    String sexo;
    String color;
    String nombre;
    boolean tieneChip;
    
    public static void main(String[] args) {
        System.out.println("Inicio del programa");
        PERRO laika = new PERRO();
        PERRO roque = new PERRO();
        System.out.println("Fin del programa.");
    }
}
