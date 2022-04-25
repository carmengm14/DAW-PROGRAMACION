/*
Escribe un programa que guarde en un fichero el contenido de otros dos 
ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los primeros
dos ficheros mezcladas, es decir, la primera línea será del primer fichero, la segunda 
será del segundo fichero, la tercera será la siguiente del primer fichero, etc.
Los nombres de los dos ficheros origen y el nombre del fichero destino se deben pasar 
como argumentos en la línea de comandos. Hay que tener en cuenta que los ficheros de 
donde se van cogiendo las líneas pueden tener tamaños diferentes.
*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;

public class Mezcla {
    public static void main(String[] args) throws IOException {
      /*
      PARA PASARLO COMO PARAMETRO QUE PONGA EL USER
      
        Scanner sc = new Scanner(System.in);
        System.out.print("1º fichero = ");
        String f1 = sc.nextLine();
        System.out.print("2º fichero = ");
        String f2 = sc.nextLine();
        System.out.print("Nombre fichero a guardar= ");
        String ffinal = sc.nextLine();
        */


        FileReader fileReader1;
        FileReader fileReader2;

        BufferedReader reader1;
        BufferedReader reader2;

        FileWriter f_out; 

        try {
            fileReader1 = new FileReader("./tema6/ficheros/ff/f1.txt" );
            fileReader2 = new FileReader("./tema6/ficheros/ff/f2.txt" );

            reader1 = new BufferedReader(fileReader1);
            reader2 = new BufferedReader(fileReader2);

            f_out = new FileWriter("./tema6/ficheros/ff/ftotal.txt");

            String lineaPrimerFichero = reader1.readLine();
            String lineaSegundoFichero = reader2.readLine();

            while (lineaPrimerFichero != null || lineaSegundoFichero != null) {
              if (lineaPrimerFichero != null) {
                f_out.write(lineaPrimerFichero + "\n");
                lineaPrimerFichero = reader1.readLine();
              }
              if (lineaSegundoFichero != null) {
                f_out.write(lineaSegundoFichero + "\n");
                lineaSegundoFichero = reader2.readLine();
              }
                
            }
            f_out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //sc.close();
    }
}
