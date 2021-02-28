package Baekjoon.Java.BOJ1300;

import java.util.*;

public class Main_1389 {
    static int n, m;
    static int[][] edge;
    static boolean[] check;
    static int count = 0;
    static List<Save> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();

        edge = new int[n + 1][n + 1];

        for (int i = 0; i < m; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();
            addEdge(a, b);
        }

        for (int i = 1; i <= n; ++i) {
            check = new boolean[n + 1];
            bfs(i);
            count = 0;
        }

        list.sort((o1, o2) -> o1.count - o2.count);

        System.out.println(list.get(0).a);
    }

    static void addEdge(int a, int b) {
        edge[a][b] = 1;
        edge[b][a] = 1;
    }

    static void bfs(int a) {
        Queue<Save> queue = new LinkedList<>();
        queue.offer(new Save(a, 0));
        check[a] = true;

        while (!queue.isEmpty()) {
            Save save = queue.poll();

            for (int i = 1; i <= n; ++i) {
                if (edge[save.a][i] == 1 && !check[i]) {
                    check[i] = true;
                    queue.offer(new Save(i, save.count + 1));
                    count += save.count + 1;
                }
            }
        }
        list.add(new Save(a, count));

    }
}

class Save {
    int a;
    int count;

    public Save(int a, int count) {
        this.a = a;
        this.count = count;
    }
}
