class Pajaro2 {

    // *** atributos o propiedades o campos ***
   
    private char color; // propiedad o atributo color
   
    private int edad; // propiedad o atributo edad
   
    // *** métodos de la clase ***
   
    // constructor de la clase pájaro
   
    public Pajaro2() {
   
      color = 'v';
   
      edad = 0;

      System.out.println("El pajaro 1 tiene " + edad + " años y es de color " + color);
   
     } 
   
    // constructor de la clase pájaro
   
    public Pajaro2(char c, int e) {
   
      color = c;
   
      edad = e;
    
      System.out.println("El pajaro 2 tiene " + edad + " años y es de color " + color);

     }
   
    // ***Aquí irán los demás métodos de la clase ***
   
    public static void main(String[] args) { // metodo main
   
     Pajaro2 p1, p2;
   
     p1 = new Pajaro2();
   
     p2 = new Pajaro2('a', 3);
     
   
    }
   
   }