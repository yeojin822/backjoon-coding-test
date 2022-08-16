package 기본수학1;

/**
 * 손익분기점
 */

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//public class Main {
//    /*
//    * (n * 상품가격 ) = 불변비용 + (가변비용 * n)
//    * (n * 상품가격 ) - (가변비용 * n) = 불변비용
//    * n(상품가격 - 가변비용) = 불변비용
//    * n = 불변이용/(상품가격 - 가변비용)
//    * 손익분기점 => n = 불변이용/(상품가격 - 가변비용) +1
//    * */
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] array = br.readLine().split(" ");
//
//        if (Integer.parseInt(array[2]) <= Integer.parseInt(array[1])) {
//            System.out.println("-1");
//        }
//        else {
//            System.out.println((Integer.parseInt(array[0])/(Integer.parseInt(array[2])-Integer.parseInt(array[1])))+1);
//        }
//
//    }
//}

/**
 * 벌집
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int start = 1;
        int totalCnt = 1;

        while (N > totalCnt){
            totalCnt += (6*start);
            start++;
        }
        System.out.println(start);
    }
}
