package 일차원배열;

/**
 * 최소, 최대
 */
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int T = Integer.parseInt(br.readLine());
//
//        String seq = br.readLine();
//        String[] array = seq.split(" ");
//
//        int max = Integer.parseInt(array[0]);
//        int min = Integer.parseInt(array[0]);
//        for (int i = 0; i < T; i++) {
//           if(max  < Integer.parseInt(array[i]))max = Integer.parseInt(array[i]);
//           if(min  > Integer.parseInt(array[i]))min = Integer.parseInt(array[i]);
//        }
//
//        bw.write(min +" "+max);
//
//        bw.flush();
//        bw.close();
//
//    }
//}

/**
 * 최댓값
 */
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[9];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int max = array[0];
//        int idx = 0;
//        for (int i = 0; i < array.length; i++) {
//           if(max  < array[i]){
//               max = array[i];
//               idx = i;
//           }
//        }
//
//        System.out.println(max);
//        System.out.println(idx+1);
//    }
//}

/**
 * 숫자의 개수
 */
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[]{0,0,0,0,0,0,0,0,0,0};
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        String multiply = (a*b*c)+"";
//        for (int i = 0; i < multiply.length(); i++) {
//            for (int j = 0; j < array.length; j++) {
//                if(Integer.parseInt(String.valueOf(multiply.charAt(i))) == j){
//                    array[j]++;
//                }
//            }
//        }
//
//        for (int i = 0; i < array.length ; i++) {
//            System.out.println(array[i]);
//        }
//
//    }
//}

/**
 * 나머지
 */
//import java.util.Arrays;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt() % 42;
//        }
//        array = Arrays.stream(array).distinct().toArray();
//        System.out.println(array.length);
//    }
//}

/**
 * 평균
 */
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double N = scanner.nextInt();
//        scanner.nextLine();
//        String[] score = scanner.nextLine().split(" ");
//        double[] newScore = new double[score.length];
//        double sum = 0;
//        double max = Double.parseDouble(score[0]);
//        for (int i = 0; i < score.length; i++) {
//            newScore[i] = Double.parseDouble(score[i]);
//            if(max < Double.parseDouble(score[i])){
//                max = Double.parseDouble(score[i]);
//            }
//        }
//
//        for (int i = 0; i < newScore.length; i++) {
//            sum += newScore[i]/max*100;
//        }
//        System.out.println(sum/N);
//    }
//}

/**
 * OX퀴즈
 */
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = Integer.parseInt(scanner.nextLine());
//        int[] score = new int[N];
//        int initial = 0;
//        for (int i = 0; i < score.length; i++) {
//            String result = scanner.nextLine();
//            for (int j = 0; j < result.length(); j++) {
//                if(result.charAt(j) == 'O'){
//                    score[i] += ++initial;
//                }else{
//                    initial = 0;
//                }
//            }
//            initial = 0;
//        }
//
//        for (int i = 0; i < score.length; i++) {
//            System.out.println(score[i]);
//        }
//
//    }
//}

/**
 * 평균은 넘겠지
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = Integer.parseInt(scanner.nextLine());

        double[] score = new double[C];

        for (int i = 0; i < C ; i++) {
            String[] array =  scanner.nextLine().split(" ");
            int sum = 0;
            int avgUp = 0;
            for (int j = 1; j < array.length; j++) {
                sum += Double.parseDouble(array[j]);
            }
            for (int j = 1; j < array.length; j++) {
               if(sum/Double.parseDouble(array[0]) < Double.parseDouble(array[j])){
                   avgUp++;
               }
            }
            score[i] = avgUp / Double.parseDouble(array[0]) * 100;
        }

        for (int i = 0; i < score.length; i++) {
            System.out.println(String.format("%.3f",score[i])+"%");
        }

    }
}
