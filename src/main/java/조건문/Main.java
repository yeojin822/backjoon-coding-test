package 조건문;

/**
 * 두 수 비교하기
 */
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String ab = scanner.nextLine();
//        int a = Integer.parseInt(ab.split( " ")[0]);
//        int b = Integer.parseInt(ab.split( " ")[1]);
//
//        if(a > b){
//            System.out.println(">");
//        }
//        if(a < b){
//            System.out.println("<");
//        }
//        if(a == b){
//            System.out.println("==");
//        }
//
//    }
//}

/**
 * 시험 성적
 */
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int score = scanner.nextInt();
//        switch (score/10){
//            case 10 :
//            case 9:
//                System.out.println("A");
//                break;
//            case 8 :
//                System.out.println("B");
//                break;
//            case 7 :
//                System.out.println("C");
//                break;
//            case 6 :
//                System.out.println("D");
//                break;
//            default:
//                System.out.println("F");
//                break;
//        }
//    }
// }

/**
 * 윤년
 */
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
//        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
//            System.out.println("1");
//        }else{
//            System.out.println("0");
//        }
//    }
//}

/**
 * 사분면 고르기
 */
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        if(x < 0 && y > 0){
//           System.out.println("2");
//        }
//        if(x > 0 && y > 0){
//            System.out.println("1");
//        }
//        if(x < 0 && y < 0){
//            System.out.println("3");
//        }
//        if(x > 0 && y < 0){
//            System.out.println("4");
//        }
//    }
//}

/**
 * 알람 시계
 */
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String time = scanner.nextLine();
//        int h = Integer.parseInt(time.split(" ")[0]);
//        int m = Integer.parseInt(time.split(" ")[1]);
//        if(h == 0){
//            if (m < 45){
//                h = 23;
//                m = m + (60-45);
//            }else{
//                m = m-45;
//            }
//        }else{
//            if (m < 45){
//                h = h-1;
//                m = m + (60-45);
//            }else{
//                m = m-45;
//            }
//        }
//        System.out.println(h + " " + m);
//    }
//}

/**
 * 오븐 시계
 */
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String time = scanner.nextLine();
//        int cookingTime = scanner.nextInt();
//        int h = Integer.parseInt(time.split(" ")[0]);
//        int m = Integer.parseInt(time.split(" ")[1]);
//        h = h + cookingTime / 60;
//        m = m + cookingTime % 60;
//
//       if(m >= 60){
//           h = h + m/60;
//           m = m % 60;
//       }
//
//       if(h >= 24){
//           h = h-24;
//       }
//        System.out.println(h+" "+m);
//    }
//}

/**
 * 주사위 세개
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] array = num.split(" ");
        int cnt = 0;
        int n = 0;
        Arrays.sort(array);
        if(array[0].equals(array[1]) && array[1].equals(array[2])){
            cnt = 3;
            n = Integer.parseInt(array[0]);
        }else if(array[0].equals(array[1]) || array[0].equals(array[2])){
            cnt = 2;
            n = Integer.parseInt(array[0]);
        }else if(array[1].equals(array[2])){
            cnt = 2;
            n = Integer.parseInt(array[1]);
        }

        if(cnt == 3){
            System.out.println(10000+n*1000);
        }
        if(cnt == 2){
            System.out.println(1000+n*100);
        }
       if(cnt == 0){
           System.out.println(Integer.parseInt(array[2])*100);
       }
    }
}