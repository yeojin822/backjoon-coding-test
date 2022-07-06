package 문자열;

/**
 * 아스키 코드
 * <p>
 * 숫자의 합
 * <p>
 * 알파벳 찾기
 */
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char c = sc.nextLine().charAt(0);
//        System.out.println((int)c);
//    }
//}

/**
 * 숫자의 합
 */
//import java.util.Arrays;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = Integer.parseInt(sc.nextLine());
//        int[] array = new int[N];
//        String num = sc.nextLine();
//        for (int i = 0; i < N; i++) {
//            array[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
//        }
//        System.out.println(Arrays.stream(array).sum());
//    }
//}


/**
 * 알파벳 찾기
 */

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[26];
        for (int i = 0; i <array.length ; i++) {
            array[i] = -1;
        }

        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
             for (int j = 97; j < 123; j++) {
                    if (array[j - 97] == -1 && (int)word.charAt(i) == j) {
                        array[j - 97] = i;
                        break;
                    }
            }
        }
        String test = Arrays.toString(array);
        test = test.replace("[","").replace("]","");
        System.out.println(test);
    }
}


