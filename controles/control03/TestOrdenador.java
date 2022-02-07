public class TestOrdenador {
    public static void main(String[] args) {
        //ordenador 1
        Teclado t1 = new Teclado(); 
        Ordenador pc1 = new Ordenador("caca","negro",t1);
        //aqui se esta llamando al metodo toString sin que nos demos cuenta.
        System.out.println("Ordenador 1: " + pc1);
        
        System.out.println("\n-------------\n");
        //ordenador 2
        Teclado t2 = new Teclado("azul", 105, "por cable", "Es", "Compacto");
        Ordenador pc2 = new Ordenador();
        pc2.setTeclado(t2);
        System.out.println("Ordenador 2: " + pc2);
        
        //contador
        System.out.println("\n-------------\n");
        t1.contarTeclados();
        pc1.contarOrdenadores();
    }   
}
