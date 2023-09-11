package dfs;

import java.io.*;
import java.util.StringTokenizer;

public class Main_11724 {
    static int MAX = 1000 + 10;
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    public static void main(String[] args) throws IOException {
        //0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        //1. graph  연결 정보 채우기
        int x, y;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            graph[x][y] = true;
            graph[y][x] = true;
        }

        //2. dfs(재귀함수) 호출
        for (int i = 1; i <=N; i++) {
            if (visited[i] == false) {
                dfs(i);
                answer++;
            }
        }

        //3. 출력
        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }

    public static void dfs(int idx) {
        visited[idx] = true;

        for (int i = 1; i <= N; i++) {
            if (visited[i] == false && graph[idx][i]) {
                dfs(i);
            }
        }
    }
}
