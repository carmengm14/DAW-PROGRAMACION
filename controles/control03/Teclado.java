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
public class Teclado {
    //Creamos los atributos.
    private String colorTeclado;    
    private int nteclas;
    private String conectividad;
    private String idioma;
    private String formatoTeclado;

    public static int contador = 0;

    //constructores 
    // Primer constructor con argumentos a los que le pasamos parametros
    public Teclado(String colorTeclado, int nteclas, String conectividad, String idioma, String formatoTeclado){
        this.colorTeclado = colorTeclado;
        this.nteclas = nteclas;

        if (conectividad.equalsIgnoreCase("inalambrico") || conectividad.equalsIgnoreCase("por cable")) {
            this.conectividad = conectividad;
        }else{
            this.conectividad = "Formato no valido";
        }

        if (idioma.length() == 2) {
            this.idioma = idioma;
        }else{
            this.idioma = "Idioma no valido";
        }
        
        if (conectividad.equalsIgnoreCase("compacto") || conectividad.equalsIgnoreCase("extendido")) {
            this.formatoTeclado = formatoTeclado;
        }else{
            this.formatoTeclado = "Formato no valido";
        }
        
        contador++;
    }
    //Segundo constructor sin argumentos
    public Teclado(){
        this.colorTeclado = "Negro";
        this.nteclas = 105;
        
        this.conectividad = "Por cable";
        if (conectividad.equalsIgnoreCase("inalambrico") || conectividad.equalsIgnoreCase("por cable")) {
            this.conectividad = getConectividad();
        }else{
            this.conectividad = "Formato no valido";
        }

        this.idioma = "Es";
        if (idioma.length() == 2) {
            this.idioma = getIdioma();
        }else{
            this.idioma = "Idioma no valido";
        }

        this.formatoTeclado = "Extendido";
        if (conectividad.equalsIgnoreCase("compacto") || conectividad.equalsIgnoreCase("extendido")) {
            this.formatoTeclado = getFormatoTeclado();
        }else{
            this.formatoTeclado = "Formato no valido";
        }

        contador++;
    }

    //getters
    public String getColorTeclado(){
        return colorTeclado;
    }
    public int getNteclas(){
        return nteclas;
    }
    public String getConectividad(){
        return conectividad;
    }
    public String getIdioma(){
        return idioma;
    }
    public String getFormatoTeclado(){
        return formatoTeclado;
        
    }
    
    //metodos
    public void contarTeclados(){
        System.out.println("Hay un total de: " + contador + " teclados.");
    }
    public String toString(){
        return colorTeclado + " - " + nteclas + " - " + formatoTeclado;
    }

    //imprimir los resultados
    /*public void printTeclado(){
        System.out.println("Tu teclado es: \n Color:" + colorTeclado + "\tNº teclas:" + nteclas + "\tConectividad:" + conectividad + "\tIdioma:" + idioma + "\tFormato:" + formatoTeclado);
    }
    */
}
