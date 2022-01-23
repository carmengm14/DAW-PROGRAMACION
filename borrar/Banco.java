package borrar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Banco {
    private int cod_ban;
    private int cod_suc;
    private int n_cuenta;
    private int orden;

    public Banco (int cod_banc, int cod_sucu, int n_cuent, int ordenn ){
        this.cod_ban =  cod_banc;
        this.cod_suc =  cod_sucu;
        this.n_cuenta =  n_cuent;
        this.orden =  ordenn;
    }

    public void imprimirDatos(){
        System.out.println("Datos del usuario: " + Banco("Codigo banco: " + cod_ban + "\tSursal: " + cod_suc + "\tNumero de cuenta: " + n_cuenta + "\tOrden: " + orden));
    }
    
    //getters and setters
   
}
