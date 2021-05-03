package Baekjoon.Java.BOJ14200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * created by jg 2021/04/22
 */
public class Main_14226_2 {
    private static boolean[][] visit;
    private static int S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = Integer.parseInt(br.readLine());
        visit = new boolean[S + 1][S + 1];

        bfs(S);
    }

    private static void bfs(int end) {
        Queue<Emoticon> queue = new LinkedList<>();
        queue.add(new Emoticon(1, 0, 0));
        visit[1][0] = true;

        while (!queue.isEmpty()) {
            Emoticon emo = queue.poll();

            if (emo.monitorCount == end) {
                System.out.println(emo.count);
                return;
            }

            if (!visit[emo.monitorCount][emo.clipCount] && emo.clipCount > 0 && emo.monitorCount + emo.clipCount <= end) {
                // 2번
                visit[emo.monitorCount][emo.clipCount] = true;
                queue.add(new Emoticon(emo.monitorCount + emo.clipCount, emo.clipCount, emo.count + 1));
            }
            if (!visit[emo.monitorCount - 1][emo.clipCount] && emo.monitorCount > 1) {
                // 3번
                visit[emo.monitorCount][emo.clipCount] = true;
                queue.add(new Emoticon(emo.monitorCount - 1, emo.clipCount, emo.count + 1));
            }

            // 1번
            queue.add(new Emoticon(emo.monitorCount, emo.monitorCount, emo.count + 1));
        }
    }
}

class Emoticon {
    int monitorCount;
    int clipCount;
    int count;

    public Emoticon(int monitorCount, int clipCount, int count) {
        this.monitorCount = monitorCount;
        this.clipCount = clipCount;
        this.count = count;
    }
}