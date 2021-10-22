import java.util.Scanner;

public class Ejer34 {
    public static void main(String[] args) {
        
        System.out.print("Escribe la letra de tu NIE en mayuscula: ");
        Scanner sc = new Scanner(System.in);
        String letraprincipio = sc.next();

        System.out.print("Escribe el numero de tu nie: ");
        int nie = sc.nextInt();
        sc.close();
        
        
      if (letraprincipio == "X") {
        nie= nie;
      } else if (letraprincipio == "Y") {
        nie= nie + 10000000;
          
      }else if (letraprincipio == "Z") {
       nie = nie + 20000000;
      }
    
        /*  if (letraprincipio == "X") {
            letraprincipio = "0";
        } else if (letraprincipio == "Y") {
            letraprincipio = "1";
        }else if (letraprincipio == "z"){
            letraprincipio = "2";
        }else{
            System.out.println("NO ESTA PERMITIDO");
        }
        */
        
        int letrafinal;
        char [] letrastotales = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P','D','X','B','N','J','Z','S','Q','V','H','L','T','K','E'};
        letrafinal = nie % 23;
        System.out.println(letraprincipio + "" + nie + "" + letrastotales[letrafinal] );
        
    }
    
}
