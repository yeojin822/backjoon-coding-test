package 반복문;

/**
 * 구구단
 */
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int dan = scanner.nextInt();
//        for (int i = 1; i <= 9; i++) {
//            System.out.println( dan + " * " +i +" = " + dan*i);
//        }
//    }
//}

/**
 * 	A+B - 3
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] arrayA = new int[T];
        int[] arrayB = new int[T];
        scanner.nextLine();
        for (int i = 0; i < T; i++) {
            String num = scanner.nextLine();
            arrayA[i] = Integer.parseInt( num.split(" ")[0]);
            arrayB[i] = Integer.parseInt( num.split(" ")[1]);
        }

        for (int i = 0; i < T; i++) {
            System.out.println(arrayA[i] + arrayB[i]);
        }

    }
}