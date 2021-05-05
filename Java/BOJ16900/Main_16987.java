package Baekjoon.Java.BOJ16900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * created by jg 2021/05/04
 */
public class Main_16987 {
    private static List<Egg> list;
    private static boolean[] visit;
    private static int N, count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        visit = new boolean[N];

        for (int i = 0; i < N; ++i) {
            int S = Integer.parseInt(br.readLine());
            int W = Integer.parseInt(br.readLine());
            list.add(new Egg(S, W));
        }

        backTracking(0);
    }

    private static void backTracking(int depth) {
        if (depth == N) {

        }

        for (int i = 0; i < N; ++i) {
            if (!visit[i] && depth != i) {
                Egg egg1 = list.get(depth);
                Egg egg2 = list.get(i);


            }
        }
    }


}

class Egg {
    int x;
    int y;

    public Egg(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
