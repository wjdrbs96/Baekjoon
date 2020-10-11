package Baekjoon.Java.BOJ13500;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 비슷한 유형을 풀어봐서 푸는 것은 바로 풀어서 쉬운줄 알았지만, 소소한 에러 잡는데 엄청 오래 걸림 (매우 분노)
// 에러 2가지
// 1. if 문을 두개로 분리 해야 함 ( ex): if (location * 2 < 100001 && !visit[location * 2]) { } 런타임에러 발생(배열인덱스) )  (분리하는 것과 나누는 것이 같다고 착각)
// 2. if 문의 순서를 유지해야함 (이건 몰랐음) * 핵심 *  => 순간이동은 0초이기 때문에 queue에 먼저 넣어줘야 한다.
public class Main_13549 {
    static int N;
    static int K;
    static boolean[] visit;
    static int[] adj;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();   // 수빈이 위치
        K = input.nextInt();   // 동생 위치

        visit = new boolean[100001];   // 점의 범위 0 <= N <= 100,000
        adj = new int[100001];         // 점의 범위 0 <= N <= 100,000

        bfs();
        System.out.println(adj[K]);
    }

    // 가장 빠른 시간으로 가야하기 때문에 bfs 사용
    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);  // 시작점
        visit[N] = true;

        while (!queue.isEmpty()) {
            int location = queue.poll();

            if (location == K) return;

            if (location * 2 < 100001) {
                if (!visit[location * 2]) {
                    visit[location * 2] = true;
                    adj[location * 2] = adj[location];
                    queue.offer(location * 2);
                }
            }
            if (location - 1 >= 0) {
                if (!visit[location - 1]) {
                    visit[location - 1] = true;
                    adj[location - 1] = adj[location] + 1;
                    queue.offer(location - 1);
                }
            }
            if (location + 1 < 100001) {
                if (!visit[location + 1]) {
                    visit[location + 1] = true;
                    adj[location + 1] = adj[location] + 1;
                    queue.offer(location + 1);
                }
            }

        }

    }
}
