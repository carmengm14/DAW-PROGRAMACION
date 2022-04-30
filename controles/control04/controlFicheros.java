import java.util.ArrayList;
import java.util.List;

/*Crea una aplicacion con las siguientes caracteristicas:
    Una clase PERSONA con los atributos: NIF, NOMBRE Y APELLIDOS
        Estos atributos deben ser accesibles para las clases hijas y no accesibles para el resto de clases
        El acceso a esos atributos se hace desde los setters y getters adecuados
    Una clase CLIENTE que hereda de PERSONA, con los atributos: ID, NOMBRE, APELLIDOS, NIF, EMAIL
        Dichos atributos no deben ser accedsibles desde fuera de la clase
        Dicho acceso se realizara desde los getters y setters apropiados
    Sobreescribe el metodo toString para mostrar los atributos de forma tabulada
    Crea una clase llamada PERSISTENCIA CLIENTE, con un método write que recibe un arrayList de clientes de 
    tal forma que escribe en un fichero (CLIENTES.DAT) todos los clientes recibidos en el arrayList, cada cliente 
    se escribe en una linea con los atributos separados por , (comas)
    Creamos un metodo llamado READ que recibe el nombre del fichero a leer/cargar y devuleve un arrayList con los 
    clientes que ha conseguido leer.    
*/

public class controlFicheros {
    public static void main(String[] args) {
        List<Cliente> listado = new ArrayList<>();

        Cliente cliente1 = new Cliente("Carmen", "García Monreal", "20919132M",0, "carmen@gmail.com");
        System.out.println(cliente1);
        
        
        Cliente cliente2 = new Cliente("Marta", "Lopez Cordoba", "20452679J",1, "marta@gmail.com");
        System.out.println(cliente2);

        listado.add(cliente1);
        listado.add(cliente2);
      /*  Cliente cliente3 = new Cliente("Marta", "Lopez Cordoba", "20452679J",2, "caca@gmail.com");
        System.out.println(cliente3);

        Cliente cliente4 = new Cliente("Marta", "Lopez Cordoba", "20452433J",2, "pis@gmail.com");
        System.out.println(cliente4);
        */
        
        PersistenciaCliente pCliente1  = new PersistenciaCliente(listado);
        try {
            pCliente1.write();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println( e.getLocalizedMessage());
        }
       
    }
}

