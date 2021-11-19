import java.util.Scanner;

public class Ejer33 {
    public static void main(String[] args) {
        System.out.print("Escribe los numeros de tu DNI sin la letra: ");
        Scanner sc = new Scanner(System.in);
        int dni = sc.nextInt();
        sc.close();
        char[] nums;
        nums = new char[22];
 
        
        switch (dni % 23) {
            case 0:
            nums [0] = 'T';
            System.out.println(nums);
                break;
            case 1:
            nums [1] = 'R';
            System.out.println(nums);
                break;
            case 2:
            nums [2] = 'W';
            System.out.println(nums);
                break;
            case 3:
            nums [3] = 'A';
            System.out.println(nums);
                break;
            case 4:
            nums [4] = 'G';
            System.out.println(nums);
                break;
            case 5:
            nums [5] = 'M';
            System.out.println(nums);
                break;
            case 6:
            nums [6] = 'Y';
            System.out.println(nums);
                break;
            case 7:
            nums [7] = 'F';
            System.out.println(nums);
                break;
            case 8:
            nums [8] = 'P';
            System.out.println(nums);
                break;
            case 9:
            nums [9] = 'D';
            System.out.println(nums);
                break;
            case 10:
            nums [10] = 'X';
            System.out.println(nums);
                break;
            case 11:
            nums [11] = 'B';
            System.out.println(nums);
                break;
            case 12:
            nums [12] = 'N';
            System.out.println(nums);
                break;
            case 13:
            nums [13] = 'J';
            System.out.println(nums);
                break;
            case 14:
            nums [14] = 'Z';
            System.out.println(nums);
                break;
            case 15:
            nums [15] = 'S';
            System.out.println(nums);
                break;
            case 16:
            nums [16] = 'Q';
            System.out.println(nums);
                break;
            case 17:
            nums [17] = 'V';
            System.out.println(nums);
                break;
            case 18:
            nums [18] = 'H';
            System.out.println(nums);
                break;
            case 19:
            nums [19] = 'L';
            System.out.println(nums);
                break;
            case 20:
            nums [0] = 'T';
            System.out.println(nums);
                break;
            case 21:
            nums [21] = 'K';
            System.out.println(nums);
                break;
            case 22:
            nums [22] = 'E';
            System.out.println(nums);
                break;
            default:
            System.out.println("NO ES VALIDO");
                break;
        }

    }
    
}
