public class Alumnotest {
    public static void main(String[] args) {
        Alumno a1, a2, a3, a4;
        
        a1 = new Alumno(1, "Pablo");
        a2 = new Alumno(2, "Manuel", "1CFSK");
        a3 = new Alumno(3, "Maria");
        a4 = new Alumno(4, "Fran", "1CFSK");  
        

        a2.preguntarDuda();
        a1.preguntarDuda();
        
        Alumno [] lista = {a1, a2, a3, a4};
        
        Alumno.imprimirInforme();
        Alumno.imprimirInformeAlumnos(lista);

    }
}
