package dfs;

import java.io.*;
import java.util.StringTokenizer;

public class Main_2644 {
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int START, END;
    static int answer;

    public static void main(String[] args) throws IOException {
        //0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        START = Integer.parseInt(st.nextToken());
        END = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(br.readLine());

        //1. graph  연결 정보 채우기
        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];
        answer = -1;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = true;
            graph[y][x] = true;
        }

        //2. dfs(재귀함수) 호출
        dfs(START, 0);

        //3. 출력
        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }

    public static void dfs(int idx, int cnt) {
        visited[idx] = true;

        if (idx == END) {
            answer = cnt;
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i] == false && graph[idx][i] == true) {
                dfs(i, cnt + 1);
            }
        }
    }
}
