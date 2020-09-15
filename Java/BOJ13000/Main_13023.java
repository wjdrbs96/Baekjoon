package Baekjoon.Java.BOJ13000;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_13023 {
    private static List<Integer>[] list;  // 인접 리스트
    private static int ans = 0;
    private static boolean[] visit;   // 방문 체크

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N = 노드 수, M = 친구 관계 수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        list = new ArrayList[N];
        visit = new boolean[N];

        for (int i = 0; i < N; ++i) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; ++i) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 노드 끼리 연결
            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 0; i < N; ++i) {
            if (ans == 0) {
                dfs(i, 1);
            }
        }

        bw.write(Integer.toString(ans));
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int start, int depth) {
        if (depth == 5) {
            ans = 1;
            return;
        }

        visit[start] = true;

        for (int i : list[start]) {
            // i 노드에 방문한 적이 없다면
            if (!visit[i]) {
                dfs(i, depth + 1);
            }
        }
        // 끝까지 갔다 왔는데 depth를 만족하지 못하면 다시 다른 노드부터 시작해야 하기 때문에 방문체크 초기화
        visit[start] = false;
    }
}
