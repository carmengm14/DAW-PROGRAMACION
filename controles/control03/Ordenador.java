/** Crea una clase Teclado con los siguientes atributos privados, color, numero de teclas, conectividad que indica si el teclado es
 *  inalambrico o por cable, idioma representado por dos letras que marcan el nombre del pais, formato que puede tomar los valores 
 * compacto o extendido.
 * Crea los getters y los setters apropiados, teniendo en cuenta que una vez creado un teclado, no se puede modificar sus atributos,
 *  pero si se pueden leer, crea tambien un contador que permita saber cuantos teclados se han creado en el sistema. 
 * 
 * Crear otra clase Ordenador.java con los siguientes atributos privados, formato que puede tomar los valores sobremesa o portatil,
 *  color y teclado, entendiendo por teclado la clase anterior.
 * 
 * Crea los setters y getters apropiados teniendo en cuenta que solo el teclado puede ser modificado despues de crear el ordenador.
 * 
 * Para las dos clases hay que crear dos constructores, uno sin parametros con unos valores por defecto y otro que si que se tienen
 *  que poner parametros determinados.
 * 
 * Extra:
 * En la clase Ordenador, crear un metodo que se llame conectar y que recibe como parametro otro ordenador, de manera que un 
 * ordenador puede estar conectado a otro.
*/
public class Ordenador {
    //Creamos los atributos.
    private String formatoOrdenador;    
    private String colorOrdenador;
    private Teclado teclado;
    // private Ordenador pcConectado = null;

    public static int contador = 0;
    //Constructores
    //Primer constructor con parametros a los cuales pasamos argumentos.
    public Ordenador(String formatoOrdenador, String colorOrdenador, Teclado teclado){
       
        if (formatoOrdenador.equalsIgnoreCase("sobremesa") || formatoOrdenador.equalsIgnoreCase("portatil")) {
            this.formatoOrdenador = formatoOrdenador;
           } else{
            this.formatoOrdenador = "Formato no valido";
           }
        this.colorOrdenador = colorOrdenador;
        this.teclado = teclado;
        contador++;
    }
    //Segundo constructor sin parametros.
    public Ordenador(){
        this.formatoOrdenador = "caca";
        if (formatoOrdenador.equalsIgnoreCase("sobremesa") || formatoOrdenador.equalsIgnoreCase("portatil")) {
            this.formatoOrdenador = getFormatoOrdenador();
           } else{
            this.formatoOrdenador = "Formato no valido";
           }
        this.colorOrdenador = "negro";
        this.teclado = new Teclado();
        contador++;
    }

    //getters and setters
    public String getFormatoOrdenador(){
       return formatoOrdenador;
    }
    public String getColorOdenador(){
        return colorOrdenador;
    }
    public Teclado getTeclado(){
        return teclado;
    }
    //setters
    public void setTeclado(Teclado teclado){
        this.teclado = teclado;
    }
   /* public void conectar(Ordenador pcConectado) {
     if (pcConectado != null) {
         this.pcConectado = pcConectado;
     }   
    }
    */
    //metodos
    public void contarOrdenadores(){
        System.out.println("Hay un total de: " + contador + " ordenadores.");
    }
    public String toString(){
        //al poner " - " + teclado estamos llamando a la clase toString ya que juntamos un objeto con un String.
        return formatoOrdenador + " - " + colorOrdenador + " - " + teclado;
    }
    //imprimir los resultados
    /*public void printOrdenador(){
        System.out.println("Tu ordenador es: \nFormato:" + formatoOrdenador + "\tColor:" + colorOrdenador + "\tTeclado:" + teclado);
    }
    */

}
