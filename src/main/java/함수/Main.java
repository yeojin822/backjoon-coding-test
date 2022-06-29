package 함수;

/**
 * 셀프 넘버
 */
//public class Main {
//    public static void main(String[] args) {
//        int index = 10000; // 1~10000까지의 수
//        boolean[] nums = new boolean[index];
//
//        for(int i=0; i<nums.length; i++) {
//            if(d(i+1) < index+1)
//                nums[d(i+1)-1] = true;
//        }
//        for(int i=0; i<nums.length; i++) {
//            if(nums[i] == false)
//                System.out.println(i+1);
//        }
//    }
//
//    public static int d(int n){
//        int sum = n;
//        while(n > 0) { //
//            sum += (n % 10);
//            n /= 10;
//        }
//        return sum;
//    }
//
//}

/**
 * 셀프 넘버
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) { //입력 범위가 1이상이므로 1부터 시작.
            if (i <= 99) { //1~99까지는 모두 한수이므로 무조건 +1
                count += 1;
            } else if (i <= 999) {
                String[] num_str = Integer.toString(i).split("");
                if ((Integer.parseInt(num_str[1]) - Integer.parseInt(num_str[0])) == (Integer.parseInt(num_str[2]) - Integer.parseInt(num_str[1]))) { //백의자리 십의자리 일의자리를 각각 a, b, c라고 생각하고 b-a == c-b 이면 한수이므로 +1
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}

