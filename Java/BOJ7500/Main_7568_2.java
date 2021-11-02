package Baekjoon.Java.BOJ7500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_7568_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Person(x, y, 1));
        }

        for (int i = 0; i < list.size(); ++i) {
            for (int j = 0; j < list.size(); ++j) {
                if (list.get(i).height > list.get(j).height && list.get(i).weight > list.get(j).weight) {
                    list.get(j).rank++;
                }
            }
        }

        for (Person person : list) {
            System.out.print(person.rank + " ");
        }

    }
}

class Person {
    int weight;
    int height;
    int rank;

    public Person(int weight, int height, int rank) {
        this.weight = weight;
        this.height = height;
        this.rank = rank;
    }
}