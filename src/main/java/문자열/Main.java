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
//import java.util.Arrays;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] array = new int[26];
//        for (int i = 0; i <array.length ; i++) {
//            array[i] = -1;
//        }
//
//        String word = sc.nextLine();
//        for (int i = 0; i < word.length(); i++) {
//             for (int j = 97; j < 123; j++) {
//                    if (array[j - 97] == -1 && (int)word.charAt(i) == j) {
//                        array[j - 97] = i;
//                        break;
//                    }
//            }
//        }
//        String test = Arrays.toString(array);
//        test = test.replace("[","").replace("]","").replace("," , "");
//        System.out.println(test);
//    }
//}

/**
 * 문자열 반복
 */
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//        int[] repeat = new int[T];
//        String[] array = new String[T];
//        String[] newArray = new String[T];
//
//        for (int i = 0; i < T; i++) {
//            String[] temp = br.readLine().split(" ");
//            repeat[i] = Integer.parseInt(temp[0]);
//            array[i] = temp[1];
//        }
//
//        for (int i = 0; i <array.length ; i++) {
//            newArray[i] = "";
//            for (int j = 0; j < array[i].length(); j++) {
//                newArray[i] += String.valueOf(array[i].charAt(j)).repeat(repeat[i]);
//            }
//        }
//
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println(newArray[i]);
//        }
//    }
//}

/**
 * 단어 공부
 */
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String word = br.readLine().toUpperCase();
//        int[] array = new int[26];
//        String answer = "";
//        int max = 0;
//        char ch = '?';
//
//        for (int i = 0; i < word.length(); i++) {
//            for (int j = 65; j < 91; j++) {
//                if((int)word.charAt(i) == j){
//                    array[j-65]++;
//                    break;
//                }
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] > max){
//                max = array[i];
//                ch = (char) (i + 65);
//            } else if (array[i] == max) {
//                ch = '?';
//            }
//        }
//        System.out.println(ch);
//    }
//}

/**
 * 단어의 개수
 */
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String word[] = br.readLine().trim().split(" ");
//        if(word[0].equals("")){
//            System.out.println(0);
//        }else {
//            System.out.println(word.length);
//        }
//    }
//}

/**
 * 상수
 */
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String word = br.readLine();
//        // 문자열 reverse
//        StringBuffer sb = new StringBuffer(word);
//        String reverse = sb.reverse().toString();
//
//        if(Integer.parseInt(reverse.split(" ")[0]) > Integer.parseInt(reverse.split(" ")[1])){
//            System.out.println(reverse.split(" ")[0]);
//        }else{
//            System.out.println(reverse.split(" ")[1]);
//        }
//
//    }
//}

/**
 * 다이얼
 */
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String word = br.readLine();
//       int time = 0;
//        for (int i = 0; i < word.length(); i++) {
//            switch (word.charAt(i)){
//                case 'A','B','C' :
//                    time += 3;
//                    break;
//                case 'D','E','F' :
//                    time += 4;
//                    break;
//                case 'G','H','I' :
//                    time += 5;
//                    break;
//                case 'J','K','L' :
//                    time += 6;
//                    break;
//                case 'M','N','O' :
//                    time += 7;
//                    break;
//                case 'P','Q','R','S' :
//                    time += 8;
//                    break;
//                case 'T','U','V' :
//                    time += 9;
//                    break;
//                case 'W','X','Y','Z' :
//                    time += 10;
//                    break;
//                default:
//                    time = 2;
//                    break;
//            }
//        }
//        System.out.println(time);
//    }
//}

/**
 * 크로아티아 알파벳
 */
//import java.io.*;
//public class Main {
//    public static void main(String[] args) throws IOException {
//        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String word = br.readLine();
//        String croatiaWord = word;
//
//        int cnt = 0;
//        for (int i = 0; i < croatia.length; i++) {
//            int temp = croatiaWord.replaceAll("/", "").length();
//            croatiaWord = croatiaWord.replaceAll(croatia[i],"/");
//            cnt += (temp - croatiaWord.replaceAll("/", "").length()) / croatia[i].length();
//        }
//        cnt += croatiaWord.replaceAll("/", "").length();
//        System.out.println(cnt);
//    }
//}

/**
 * 그룹 단어 체커
 */
import java.io.*;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] array = new String[num];
        int cnt = 0;


        for (int i = 0; i < num; i++) {
            array[i] = br.readLine();
        }
        for (int i = 0; i < array.length; i++) {
            HashSet set = new HashSet();
            boolean check = true;
            int temp =  array[i].charAt(0);
            set.add(array[i].charAt(0));
            for (int j = 1; j < array[i].length(); j++) {
                if(temp == array[i].charAt(j)){
                    continue;
                }else{
                    if(set.contains(array[i].charAt(j))){
                        check = false;
                        break;
                    }else{
                    set.add(array[i].charAt(j));
                    temp = array[i].charAt(j);
                    }
                }
            }
           cnt += check ? 1 : 0;
        }

        System.out.println(cnt);
    }
}