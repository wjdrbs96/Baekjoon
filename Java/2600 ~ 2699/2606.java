package Java_Algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2606 {
    boolean[] visit;
    int[][] adj;
    int size;

    public Main_2606(int size) {
        this.size = size;
        adj = new int[size + 1][size + 1];
        visit = new boolean[size + 1];
    }

    public void Edge(int start, int end) {
        adj[start][end] = 1;
        adj[end][start] = 1;
    }

    public int BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        q.offer(v);
        visit[v] = true;
        while(!q.isEmpty()) {
            v = q.poll();
            for (int w = 1; w < size + 1; ++w) {
                if (adj[v][w] == 1 && !visit[w]) {
                    visit[w] = true;
                    count++;
                    q.offer(w);
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 컴퓨터 수
        int m = input.nextInt(); // 연결되어 있는 컴퓨터 쌍 수
        Main_2606 ma = new Main_2606(n);
        for (int i = 0; i < m; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();
            ma.Edge(a, b);
        }

        int count = ma.BFS(1);
        System.out.println(count);
    }
}
