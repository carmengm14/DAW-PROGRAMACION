package tema6.ficheros.actividades;
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
            fileReader1 = new FileReader("/home/alumno/Documentos/ff/f1.txt" );
            fileReader2 = new FileReader("/home/alumno/Documentos/ff/f2.txt" );

            reader1 = new BufferedReader(fileReader1);
            reader2 = new BufferedReader(fileReader2);

            f_out = new FileWriter("/home/alumno/Documentos/ff/ftotal.txt");

            String car1 = reader1.readLine();
            String car2 = reader2.readLine();

            while (car1 != null || car2 != null) {
              if (car1 != null) {
                f_out.write(car1 + "\n");
                car1 = reader1.readLine();
              }
              if (car2 != null) {
                f_out.write(car2 + "\n");  
                car2 = reader2.readLine();
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
