/* explicacion clases y objetos con perros*/
public class PERRO{
    int edad;
    String raza;
    String sexo;
    String color;
    String nombre;
    boolean tieneChip;
    static void ladrar(){
        System.out.println("Guau guau...");
    }

    public static void main(String[] args) {
        System.out.println("Inicio del programa");
        PERRO laika = new PERRO();
        PERRO roque = new PERRO();

        laika.nombre = "Laika";
        laika.edad = 10;

        roque.nombre = "Roque";
        roque.color = "Negro";

        System.out.println(laika.nombre);
        System.out.println(laika.edad);
        PERRO.ladrar();
        System.out.println(roque.nombre);
        System.out.println(roque.color);
        
        System.out.println("Fin del programa.");
    }
}
