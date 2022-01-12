/** crear clase alumno, cuyos objetos tendran como caracteristicas un ID, un nombre y un grupo (1CFSJ), se pueden crear alumnos solo con el nombre y el id, o tambien con el nombre, el identificador y el grupo (osea todo), pero se necesita alguna informacion para pasar a los alumnos, tambien tiene que tener un metodo llamado preguntarDuda que simplemente imprime el nombre del alumno (ejemplo Pedro) + levanta la mano, y nuestra clase ademas debe de tener un contador del total de alumnos creados, tambien hay un metodo de clase llamado imprimirInforme, que muestra el total de alumnos, otro metodo de clase, que se llama imprimirInformeAlumnos, al que se le pasa como parametros un Array de alumnos e imprime el nombre y grupo de cada alumno. */

class Alumno {
    //Zona de atributos de CLASE
    public static int totalAl = 0;

    //ZONA DE ATRIBUTOS
    private int id; // propiedad o atributo de id
    private String nombre; // propiedad o atributo de nombre
    private String grupo; //propiedad o atributo de grupo

    //ZONA DE METODOS
    //En caso de no tener grupo del alumno
    public Alumno(int identificador, String nombreAl){
        id = identificador;
        nombre = nombreAl;
        grupo = "No asignado";
        totalAl++;
    }
    //En caso de tener grupo del alumno
    public 
    Alumno(int identificador, String nombreAl, String grupoAl){
        id = identificador;
        nombre = nombreAl;
        grupo = grupoAl;
        totalAl++;
    }
    //Creamos el metodo de dudas
    public void preguntarDuda(){
        System.out.println("El alumno " + nombre + " con id: '" + id + "', levanta la mano");
    }
    //Creamos el metodo que imprima el total de alumnos
    public static void imprimirInforme(){
        System.out.println("Total de alumnos creados: " + totalAl);
    }
    public static void imprimirInformeAlumnos(Alumno[] alumno){
        System.out.println("Nombre\tGrupo\t");
        for (Alumno Alumno : alumno) {
            /*el punto sirve para acceder a los atributos y metodos de los objetos, (el alumno.nombre o el alumno. grupo lo que hace es, que alumno coja los atributos tanto de nombre como de grupo.)*/
            //El \t es un tabuladors
            System.out.println(Alumno.nombre + "\t" + Alumno.grupo);
        }
    }
}
