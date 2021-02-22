package Baekjoon.Java.BOJ14200;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 풀이 보고 푼 문제 (알고리즘은 언제쯤 잘해질까,,)
// 풀이보면 그러려니 하는데 내가 짜라면 못짜겠는 코드
public class Main_14226 {
    static int S;
    static int[][] adj;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        S = input.nextInt();
        adj = new int[S + 1][S + 1];  // 화면이모티콘/클립보드 저장

        // 배열을 전부 -1로 초기화 (방문하지 않은 곳이면 -1)
        for (int i = 0; i < S + 1; ++i) {
            Arrays.fill(adj[i], -1);
        }

        bfs();
    }

    // 시간의 최소값 구하기 => bfs
    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(0);

        adj[1][0] = 0;

        while (!queue.isEmpty()) {
            int s = queue.poll();  // 화면 이모티콘 수
            int c = queue.poll();  // 클립보드 수

            // 방문하지 않은 곳이라면 => 화면 이모티콘을 클립보드 저장
            if (adj[s][s] == -1) {
                adj[s][s] = adj[s][c] + 1;
                queue.offer(s);
                queue.offer(s);
            }

            // 방문하지 않은 곳이라면 => 클립보드에 있는 걸 화면에 붙여넣기
            // 그리고 붙여넣었을 때 화면의 이모티콘 수가 S보다 작거나 같아야 함
            if (s + c <= S && adj[s + c][c] == -1) {
                adj[s + c][c] = adj[s][c] + 1;
                queue.offer(s + c);
                queue.offer(c);
            }

            // 이모티콘을 제거하는 경우
            if (s - 1 >= 0 && adj[s - 1][c] == -1) {
                adj[s - 1][c] = adj[s][c] + 1;
                queue.offer(s - 1);
                queue.offer(c);
            }
        }

        // 2차원 배열에서 최소값 구하기
        int ans = -1;
        for (int i = 0; i <= S; ++i) {
            if (adj[S][i] != -1) {  // 방문한 점 기준
                if (ans == -1 || ans > adj[S][i]) {
                    ans = adj[S][i];
                }
            }
        }

        System.out.println(ans);
    }
}
