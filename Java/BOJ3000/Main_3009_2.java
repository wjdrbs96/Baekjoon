package Baekjoon.Java.BOJ3000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/11/01
 */
public class Main_3009_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Coordinate> list = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Coordinate(x, y));
        }

        int x4 = 0, y4 = 0;

        Coordinate coordinate1 = list.get(0);
        Coordinate coordinate2 = list.get(1);
        Coordinate coordinate3 = list.get(2);

        if (coordinate1.x == coordinate2.x) {
            x4 = coordinate3.x;
        } else if (coordinate1.x == coordinate3.x) {
            x4 = coordinate2.x;
        } else {
            x4 = coordinate1.x;
        }

        if (coordinate1.y == coordinate2.y) {
            y4 = coordinate3.y;
        } else if (coordinate1.y == coordinate3.y) {
            y4 = coordinate2.y;
        } else {
            y4 = coordinate1.y;
        }

        System.out.println(x4 + " " + y4);

    }
}

class Coordinate {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
