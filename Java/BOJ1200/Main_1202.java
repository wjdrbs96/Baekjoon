package Baekjoon.Java.BOJ1200;

import java.util.*;

public class Main_1202 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();  // 보석의 총 개수
        int K = input.nextInt();  // 가방의 개수

        List<Bosuk> list = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            int M = input.nextInt();  // 보석의 무게
            int V = input.nextInt();  // 보석의 가격
            list.add(new Bosuk(M, V));
        }

        int[] weightBag = new int[K + 1];
        for (int i = 0; i < K; ++i) {
            int C = input.nextInt(); // 가방에 담을 수 있는 최대 무게
            weightBag[i + 1] = C;
        }

        // 보석의 무게로 정렬
        list.sort((o1, o2) -> o1.M - o2.M);
        Arrays.sort(weightBag);

        PriorityQueue<Integer> pr = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        int j = 0;
        for (int i = 1; i < K + 1; ++i) {
            while (j < N && list.get(j).M <= weightBag[i]) {
                pr.add(list.get(j).V);
                j++;
            }
            if (!pr.isEmpty()) {
                sum += pr.poll();
            }
        }
        System.out.println(sum);
    }
}

class Bosuk {
    int M;
    int V;

    public Bosuk(int m, int v) {
        M = m;
        V = v;
    }
}