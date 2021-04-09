package Baekjoon.Java.BOJ2100;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * created by jg 2021/04/09
 */
public class Main_2141 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        List<Person> list = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        list.sort((o1, o2) -> o1.y - o2.y);


    }
}

class Person {
    int x;
    int y;

    public Person(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
