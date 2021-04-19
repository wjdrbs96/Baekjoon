package Baekjoon.Java.BOJ16900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by jg 2021/04/20
 */
public class Main_16953 {
    private static int A, B;
    private static boolean check = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        bfs(new Save(A, 0));

        if (!check) {
            System.out.println(-1);
        }
    }

    private static void bfs(Save save) {
        Queue<Save> queue = new LinkedList<>();
        queue.add(save);

        while (!queue.isEmpty()) {
            Save s = queue.poll();

            if (s.x > B) {
                continue;
            }

            if (s.x == B) {
                System.out.println(s.count + 1);
                check = true;
                break;
            }

            queue.add(new Save(s.x * 2, s.count + 1));
            queue.add(new Save(s.x * 10 + 1, s.count + 1));
        }
    }
}

class Save {
    long x;
    int count;

    public Save(long x, int count) {
        this.x = x;
        this.count = count;
    }
}
