package Baekjoon.Java.BOJ7900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * created by jg 2021/04/09
 */
public class Main_7983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Save> pr = new PriorityQueue<>();

        for (int i = 0; i < N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            pr.add(new Save(d, t));
        }

        int limit = pr.peek().y;

        while (!pr.isEmpty()) {
            Save poll = pr.poll();

            if (poll.y < limit) {
                limit = poll.y - poll.x;
            } else {
                limit = limit - poll.x;
            }
        }

        System.out.println(limit);
    }
}

class Save implements Comparable<Save> {
    int x;   // 과제가 걸리는 시간
    int y;   // 과제 마감 기한

    public Save(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Save o) {
        return o.y - y;
    }
}