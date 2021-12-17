/**Crea un programa llamado Calculadora.

El programa debe ir leyendo las operaciones que introduce el usuario:

- 3       + 6
- 3456.45    x    89
- asdlkfjlsdkf 4 + 7

Debe devolver el resultado o el mensaje de "Operación incorrecta"

El programa debe terminar si se escribe "fin" o "Fin" o "FIN". Es decir, la palabra fin sin tener en cuenta minúsculas ni mayúsculas.

Las operaciones válidas son:

+, - , / y (x o X)  */

public class calculadoraJulio {
    public static double operaciones(char respuesta, double numero1, double numero2) {
       double suma, resta, multiplicacion, division;
       
       if (respuesta == '+') {
            suma = numero1 + numero2;
            System.out.println(numero1 + " + " + numero2 + " = " + suma);
            System.out.println("-----------------");
        } else if(respuesta == '-') {
            resta = numero1 - numero2;
            System.out.println(numero1 + " - " + numero2 + " = " + resta);
            System.out.println("-----------------");
        }else if(respuesta == '/'){
            division = numero1 / numero2;
            System.out.println(numero1 + " / " + numero2 + " = " + division);
            System.out.println("-----------------");
        }else if(respuesta == 'x' || respuesta == 'X'){
            multiplicacion = numero1 * numero2;
            System.out.println(numero1 + " x " + numero2 + " = " + multiplicacion);
            System.out.println("-----------------");
        }else{
            System.out.println("LA OPERACION DESEADA, NO ES VALIDA");
            System.out.println("-----------------");
        }
    
        return respuesta;
    }
   
    

    public static void main(String[] args) {

        boolean stop = true;
        String paron = Utilidades.leerCadena("Si deseas parar, escribe fin = ");
            
        if (paron.equalsIgnoreCase("fin")) {
            stop = false;
        } else {
            stop = true;
        } 

        do{ 
            
            double numero1 = Utilidades.leerDoble("Escribe el primer digito = ");
            double numero2 = Utilidades.leerDoble("Escribe el segundo digito = ");
            char respuesta = Utilidades.leerCaracter("¿Que operacion deseas hacer? ( ESCRIBE EL SIGNO ) = ");
            operaciones(respuesta, numero1, numero2);

            paron = Utilidades.leerCadena("Si deseas parar, escribe fin = ");
            System.out.println(" ");
            
            if (paron.equalsIgnoreCase("fin")) {
                stop = false;
            } else {
                stop = true;
            } 
        }while(stop);        
        
        
        
        /*
        operaciones('+', 54.2, 34.5);
        operaciones('-', 54.2, 34.5);
        operaciones('/', 54.2, 34.5);
        operaciones('x', 54.2, 34.5);
        operaciones('*', 54.2, 34.5);
        */
    }
}
