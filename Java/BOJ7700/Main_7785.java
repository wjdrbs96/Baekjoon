package Baekjoon.Java.BOJ7700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * created by Gyunny 2021/11/02
 */
public class Main_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<String, String> hm = new HashMap<>();
        Set<String> names = new HashSet<>();

        for (int i = 0; i < N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();

            names.add(name);
            hm.put(name, log);
        }

        List<String> l = new ArrayList<>(names);
        l.sort(Comparator.reverseOrder());

        for (int i = 0; i < names.size(); ++i) {
            if (hm.get(l.get(i)).equals("enter")) {
                System.out.println(l.get(i));
            }
        }
    }
}
