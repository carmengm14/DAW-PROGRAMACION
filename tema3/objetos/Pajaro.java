class Pajaro {

    // *** atributos o propiedades o campos ***
    private char color; // propiedad o atributo color
    private int edad; // propiedad o atributo edad
   
    // *** métodos de la clase ***
    public void setEdad(int e) {
     edad = e;
    }
    public void printEdad() {
     System.out.println(edad);
    }
    public void setColor(char c) {
     color = c;
    }
    public void printColor() {
     switch (color) {
      //los pájaros son verdes, amarillos, grises, negros o blancos
      //No existen pájaros de otros colores
      case 'v':
       System.out.println("verde");
       break;
      case 'a':
       System.out.println("amarillo");
       break;
      case 'g':
       System.out.println("gris");
       break;
      case 'n':
       System.out.println("negro");
       break;
      case 'b':
       System.out.println("blanco");
       break;
      default:
       System.out.println("color no establecido");
     }
    }
   }
   
   class Crear {
    public static void main(String[] args) { // metodo main
     pajaro p;
     p = new pajaro();
     p.setEdad(5);
     p.printEdad();
    }
   }
