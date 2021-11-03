import java.util.Scanner;

public class Entrada {

    public static int getInteger (){
        int numero;
        Scanner sc = new Scanner(System.in);
        while (true){
            
            System.out.print("Introduce un valor: ");
            
           if (sc.hasNextInt()){
                numero = sc.nextInt();
                break;
            }else{
                sc.nextLine();
            }
        }
        sc.close();
        return numero;
    }

    public static double getDouble (){
        double numero;
        Scanner sc = new Scanner(System.in);
        while (true){
            
            System.out.print("Introduce un valor: ");
            
           if (sc.hasNextDouble()){
                numero = sc.nextDouble();
                break;
            }else{
                sc.nextLine();
            }
        }
        sc.close();
        return numero;
    }
    public static void main (String[] args){
      getDouble();
    }
}