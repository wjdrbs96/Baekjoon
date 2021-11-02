package Baekjoon.Java.BOJ1900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_1931_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Conference> list = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new Conference(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        list.sort((o1, o2) -> {
            if (o1.endTime == o2.endTime) return o1.startTime - o2.startTime;
            return o1.endTime - o2.endTime;
        });

        int count = 1;
        Conference ci = list.get(0);
        for (int i = 1; i < list.size(); ++i) {
            Conference cj = list.get(i);

            if (ci.endTime <= cj.startTime) {
                ci = cj;
                count++;
            }

        }

        System.out.println(count);

    }
}

class Conference {
    int startTime;
    int endTime;

    public Conference(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
