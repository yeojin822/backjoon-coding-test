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
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int T = scanner.nextInt();
//        int[] arrayA = new int[T];
//        int[] arrayB = new int[T];
//        scanner.nextLine();
//        for (int i = 0; i < T; i++) {
//            String num = scanner.nextLine();
//            arrayA[i] = Integer.parseInt( num.split(" ")[0]);
//            arrayB[i] = Integer.parseInt( num.split(" ")[1]);
//        }
//
//        for (int i = 0; i < T; i++) {
//            System.out.println(arrayA[i] + arrayB[i]);
//        }
//
//    }
//}

/**
 * 	합
 */
//import java.io.*;
//import java.util.StringTokenizer;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
//        int T = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < T; i++) {
//            st = new StringTokenizer(br.readLine());
//            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
//        }
//        bw.flush();
//        bw.close();
//
//    }
//}

/**
 * 	N 찍기
 */
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int N = Integer.parseInt(br.readLine());
//
//        for (int i = 1; i <= N; i++) {
//            bw.write(i + "\n");
//        }
//        bw.flush();
//        bw.close();
//    }
//}

/**
 * 	기찍 N
 */
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int N = Integer.parseInt(br.readLine());
//
//        for (int i = N; i > 0; i--) {
//            bw.write(i + "\n");
//        }
//        bw.flush();
//        bw.close();
//    }
//}

/**
 * 	A+B - 7
 */
//import java.io.*;
//import java.util.StringTokenizer;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
//        int T = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < T; i++) {
//            st = new StringTokenizer(br.readLine());
//            bw.write("Case #"+(i+1)+": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
//        }
//        bw.flush();
//        bw.close();
//
//    }
//}

/**
 * 	A+B - 8
 */
//import java.io.*;
//import java.util.StringTokenizer;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
//        int T = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < T; i++) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            bw.write("Case #"+(i+1)+": " + a +" + "+ b +" = " +(a+b)+"\n");
//        }
//        bw.flush();
//        bw.close();
//
//    }
//}

/**
 * 별 찍기 - 1
 */
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 1; i <= T; i++) {
//            for (int j = 0; j < i; j++) {
//                sb.append("*");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//    }
//}

/**
 * 별 찍기 - 2
 */
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 1; i <= T; i++) {
//            for (int j = i; j < T; j++) {
//                sb.append(" ");
//            }
//            for (int k = 0; k < i; k++) {
//                sb.append("*");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//    }
//}

/**
 * X보다 작은 수
 */
//import java.io.*;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String s = br.readLine();
//
//        StringTokenizer st = new StringTokenizer(s);
//        int a = Integer.parseInt(st.nextToken()); // 첫번째 호출
//        int b = Integer.parseInt(st.nextToken()); // 두번째 호출
//
//        String seq = br.readLine();
//        String array [] = seq.split(" ");
//
//        for (int i = 0; i < array.length; i++) {
//            if(Integer.parseInt(array[i]) < b)
//            bw.write(array[i] + " ");
//        }
//        bw.flush();
//        bw.close();
//    }
//}

/**
 * A+B - 5
 */
//import java.io.*;
//import java.util.StringTokenizer;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
//        String s;
//        int a = 1;
//        int b = 1;
//        while (a >0 && b> 0){
//            s = br.readLine();
//            st = new StringTokenizer(s);
//            a = Integer.parseInt(st.nextToken()); // 첫번째 호출
//            b = Integer.parseInt(st.nextToken()); // 두번째 호출
//            if(a >0 && b> 0)bw.write(a+b + "\n");
//        }
//        bw.flush();
//        bw.close();
//    }
//}

/**
 * A+B - 4
 */
//import java.io.*;
//import java.util.StringTokenizer;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
//        String s;
//        int a, b ;
//
//        while(true) {
//            s = br.readLine();
//            if(s == null){
//                break;
//            }
//            st = new StringTokenizer(s);
//            a = Integer.parseInt(st.nextToken()); // 첫번째 호출
//            b = Integer.parseInt(st.nextToken()); // 두번째 호출
//            bw.write(a+b + "\n");
//        }
//
//        bw.flush();
//        bw.close();
//    }
//}

///**
// * 더하기 사이클
// */
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] array = new String[2];
//        int num;
//        int cnt = 0;
//        String N = br.readLine();
//        if(Integer.parseInt(N) < 10){
//            num = Integer.parseInt(N);
//        }else{
//          num = Integer.parseInt(String.valueOf(N.charAt(0))) + Integer.parseInt(String.valueOf(N.charAt(1)));
//        }
//
//
//        while(!N.equals(array[0]+array[1]) && num != 0){
//            String numS = num+"";
//            if(array[0] == null && array[1] == null) {
//                if (Integer.parseInt(N) < 10) {
//                    array[0] = "0";
//                    array[1] = N;
//                } else {
//                    array[1] = String.valueOf(N.charAt(1));
//                }
//            }
//            array[0] = array[1];
//            if(num < 10){
//                array[1] = String.valueOf(num);
//            }else{
//                array[1] = String.valueOf(numS.charAt(1));
//            }
//
//            num = Integer.parseInt(array[0]) + Integer.parseInt(array[1]);
//            cnt++;
//        }
//        if (num == 0){
//            System.out.println(1);
//        }else{
//            System.out.println(cnt);
//        }
//
//    }
//}