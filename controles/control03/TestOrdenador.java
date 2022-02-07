public class TestOrdenador {
    public static void main(String[] args) {
        //ordenador 1
        Teclado t1 = new Teclado(); 
        Ordenador pc1 = new Ordenador("caca","negro",t1);
        pc1.printOrdenador();
        t1.printTeclado();

        System.out.println("\n-------------\n");
        //ordenador 2
        Teclado t2 = new Teclado("azul", 105, "por cable", "Es", "Compacto");
        Ordenador pc2 = new Ordenador();
        t2.printTeclado();
        pc2.printOrdenador();
        
        //contador
        System.out.println("\n-------------\n");
        t1.contarTeclados();
        pc1.contadorDeOrdenadores();
    }   
}
