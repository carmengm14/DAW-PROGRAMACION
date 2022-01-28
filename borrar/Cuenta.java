package borrar;
/*import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
*/

public class Cuenta {
    private int cod_ban;
    private int cod_suc;
    private int n_cuenta;
    private String orden;

    public Cuenta (int cod_banc, int cod_sucu, int n_cuent,String ord ){
        this.cod_ban =  cod_banc;
        this.cod_suc =  cod_sucu;
        this.n_cuenta =  n_cuent;
        this.orden =  ord;
    }

    public void imprimirDatos(){
        System.out.println("Datos del usuario:\n" + "\tCodigo banco: " + cod_ban + "\n\tSucursal: " + cod_suc + "\n\tNumero de cuenta: " + n_cuenta + "\n\tOrden: " + orden);
    }
    
    // Cuenta c = new Cuenta(...,...,...);
    // c.imprimirDatos();

    public int getCodBanco(){
        return this.cod_ban;
    }
    public int getCodSucursal(){
        return this.cod_suc;
    }
    public int getNcuenta(){
        return this.n_cuenta;
    }
    public String getOrden(){
        return this.orden;
    }
    
    public boolean validarCodBanco(String codBanco){
        boolean resultado = false;
        if(codBanco.length()==0 || codBanco.length()==3){
            if(codBanco.length() == 3){
                if((int) codBanco.charAt(0) > 1){
                    resultado = true;
                }
            }else{
                resultado = true;
            }
        }
        return resultado;
    }

    public boolean validarCodSucursal(String codSuc){
        boolean resultado = false;
        
        if(codSuc.length() == 4){
            if((int) codSuc.charAt(0) > 0){
                resultado = true;
            }
        }

        return resultado;
    }

    public boolean validarNumCuenta(String numCuenta){
        if(numCuenta.length() == 5){
            return true;
        }
        return false;
    }

    public boolean validarClave(String clave){
        if(clave.length() == 5){
            for (int i = 0; i < clave.length(); i++) {
                if(!Character.isLetterOrDigit(clave.charAt(i))){
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    // validarOrden("");

    public String validarOrden(String arg){
        if(arg.length() == 0){
            return "Talonario y Movimientos";
        }else if(arg.equals("Talonario")){
            return "Talonario";
        }else if(arg.equals("Movimientos")){
            return "Movimientos";
        }

        return "Error";
    }
}
