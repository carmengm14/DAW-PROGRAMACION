import javax.swing.plaf.synth.SynthSpinnerUI;

/*
 * Un texto está bien parentizado si por cada paréntesis abierto hay
 *  otro detrás que lo cierra. 
 *  Por ejemplo, la cadena
 *  Esto (es (un ejemplo) (de) una (cadena bien) parentizada)
 *  está bien parentizada.
 *  Pero la cadena
 *      una )cadena (mal (parentizada)
 *  no lo está
 *  Diseña un programa que nos diga si una cadena está bien parentizada o no
 */
public class parentesis {
    public static boolean parentizada(String cadena){
        int parentesis =0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(') {
                parentesis++;
            }else if (cadena.charAt(i) == ')') {
                parentesis--;
            }
        }
        
        if (parentesis == 0) {
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Escribe una cadena: ");
        if (parentizada(cadena) == true) {
            System.out.println(cadena + ": ESTA BIEN PARENTIZADA");
        }else{
            System.out.println(cadena + ": NO ESTA BIEN PARENTIZADA");
        }
    }
}
