import java.io.File;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        
        File f = File.listRoots()[0];      
        File[] directorio = f.listFiles();
        Scanner sc = new Scanner(System.in);
        int r = 0;
        int n = 1;
        String  permisos = "";
        String tipo = "";
        do{
            System.out.println("Lista de ficheros y directorios de: " + f);
            System.out.println("-----------------------------------");

            if(f.getParent()==null){
                System.out.println("0.- Directorio padre");
            }else{
                System.out.println(0 + ".- " + f.getParent());
            }

            for (File elemento : directorio) {
                if(elemento.isDirectory()){
                    tipo = "d";
                }else{
                    tipo = "-";
                }
                if(elemento.canExecute()){
                    permisos += "x";
                }else{
                    permisos += "-";
                }
                if(elemento.canRead()){
                    permisos += "r";
                }else{
                    permisos += "-";
                }
                if(elemento.canWrite()){
                    permisos += "w";
                }else{
                    permisos += "-";
                }

                int tamaño = (int) elemento.length();

                DateFormat formatter;
                formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());
                //....
                String ultMod = formatter.format(elemento.lastModified());
                
                System.out.println(n + " .- " + "\t" + tipo + permisos+ "\t" + tamaño + "\t" + ultMod + "\t" + elemento.getName());
                permisos = "";
                n++;   
            }
            System.out.print("Introduce la opcion -1 para salir o el numero de directorio para ver su contenido: ");
            r = sc.nextInt();
            n = 1;
            if(r == 0){
                f = f.getParentFile();
            }else{
                if(directorio[r-1].canRead()){                
                    f = directorio[r-1];
                }else{
                    System.out.println("No tienes permisos de lectura");
                }
            }
            directorio = f.listFiles();
        }while (r != -1); 
            
        sc.close();
    }
}