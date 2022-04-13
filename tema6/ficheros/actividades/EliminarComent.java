import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EliminarComent {
    String cadena = null;

    public EliminarComent(String cadena){
        if(cadena.getClass().getName().substring(cadena.getClass().getName().indexOf(".")).equals(".java")){
            this.cadena = cadena.readLine();
        }else{
            System.out.println("No es un archivo JAVA");
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("./tema6/ficheros/actividades/ficheroJava.java"));
        

        public void eliminarComentario(String cadena){
            String[] cadenaSeparada = cadena.toLowerCase().split(" ");

            for (int i = 0; i < cadenaSeparada.length; i++) {
                if (cadenaSeparada[i].substring("//")) {
                    
                }
                reader.readLine();         
            }
     }
    }
}
