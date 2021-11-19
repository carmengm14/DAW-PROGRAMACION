public interface Ejer31 {
    public static void main(String[] args) {
        int [] dias;
        dias = new int [10];

        dias [0] = 5;
        dias [1] = 10;
        dias [2] = 15;
        dias [3] = 20;
        dias [4] = 25;
        
        for (int i = 0; i < dias.length; i++) {
            System.out.println("El dia es: " + dias [i]);
        }

    }
}
