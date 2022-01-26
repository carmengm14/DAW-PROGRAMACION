package borrar;

public class TestCuenta {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(456,1232,12025,"Movimientos");
        c.imprimirDatos();

        System.out.println("Validar \n\tCodigo banco: " + c.validarCodBanco(Integer.toString(c.getCodBanco())) + "\n\tSucursal: " + c.validarCodSucursal(Integer.toString(c.getCodSucursal())) + "\n\tNumero de cuenta: " + c.validarNumCuenta(Integer.toString(c.getNcuenta())) +"\n\tOrden: " + c.validarOrden(c.getOrden()));
        // getters y setters
        // validar etc etc
    }
}
