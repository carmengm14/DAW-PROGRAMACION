package unpocodetodo;

public class ArgumentosSuma {
    public static void main(String[] args) {
        double suma= 0;
        System.out.println("===============");
        System.out.println("Arguentos: " + args.length);
        System.out.println("---------------");
        for (int i = 0; i < args.length; i++) { 
            Double temp= Double.parseDouble(args[i]);
            suma= suma + temp;
        }
        System.out.println("Suma = " + suma);
        System.out.println("===============");    
    }
}