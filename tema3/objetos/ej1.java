/** crear clase alumno, cuyos objetos tendran como caracteristicas un ID, un nombre y un grupo (1CFSJ), se pueden crear alumnos solo con el nombre y el identificador, o tambien con el nombre, el identificador y el grupo (osea todo), pero se necesita alguna informacion para pasar a los alumnos, tambien tiene que tener un metodo llamado preguntarDuda que simplemente imprime el nombre del alumno (ejemplo Pedro) + levanta la mano, y nuestra clase ademas debe de tener un contador del total de alumnos creados, tambien hay un metodo de clase llamado imprimirInforme, que muestra el total de alumnos, otro metodo de clase, que se llama imprimirInformeAlumnos, al que se le pasa como parametros un Array de alumnos e imprime el nombre y grupo de cada alumno. */
class alumno {
    private int id; // propiedad o atributo de id
    private String nombre; // propiedad o atributo de nombre
    private String grupo; //propiedad o atributo de grupo

    public void preguntarDuda(){
        System.out.println("El alumno " + nombre + ", levanta la mano");
    }
}
