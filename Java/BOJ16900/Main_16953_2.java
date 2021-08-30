package Baekjoon.Java.BOJ16900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/08/30
 */
public class Main_16953_2 {
    private static int a, b, count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        int count = bfs(new ABClass(a, 1));
        if (count == -1) {
            System.out.println("-1");
        } else {
            System.out.println(count);
        }
    }

    private static int bfs(ABClass abClass) {
        Queue<ABClass> queue = new LinkedList<>();
        queue.add(abClass);

        while (!queue.isEmpty()) {
            ABClass ab = queue.poll();

            if (ab.a == b) {
                return ab.count;
            }

            if (ab.a * 2 <= b) {
                queue.add(new ABClass(ab.a * 2, ab.count + 1));
            }
            if (ab.a * 10 + 1 <= b) {
                queue.add(new ABClass(ab.a * 10 + 1, ab.count + 1));
            }
        }
        return -1;
    }
}

class ABClass {
    long a;
    int count;

    public ABClass(long a, int count) {
        this.a = a;
        this.count = count;
    }
}
