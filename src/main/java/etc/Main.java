package etc;


/**
 * 코테 풀이
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static String[] A;
    private static String[] P;
    private static boolean[] visit;
    private static int people = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] info = br.readLine().split(" ");
        A = br.readLine().split(" ");
        P = br.readLine().split(" ");
        int n = Integer.parseInt(info[0]);
        int k = Integer.parseInt(info[1]);
        visit  = new boolean[n];
        people = bfs(0,k);
//        for(int i=0;i<n;i++) {
//            if (k >= Integer.parseInt(A[i])){
//                dfs(i,k,0);
//            }
//        }

        System.out.println(people);

    }

//    public static void dfs(int idx, int k, int depth) {
//        visit[idx]=true;
//        k -= Integer.parseInt(A[idx]);
//        depth += Integer.parseInt(P[idx]);
//        for(int i=0;i<A.length;i++) {
//            if(!visit[i] && Integer.parseInt(A[i]) <= k){
//                dfs(i,k,depth);
//            }
//        }
//        people = Math.max(depth, people);
//        visit[idx]=false;
//    }

    public static int bfs(int idx, int k){
        Queue<Integer> q = new LinkedList<>();
        visit[idx]=false;
        int depth = 0;
        q.add(idx);
        while(!q.isEmpty()){
            int now = q.poll();
            for(int i=0;i<A.length;i++) {
                if(!visit[i] && Integer.parseInt(A[now]) <= k){
                    visit[i] = true;
                    q.add(i);
                    k -= Integer.parseInt(A[i]);
                    depth += Integer.parseInt(P[i]);
                }
            }
        }
        return depth;
    }
}
