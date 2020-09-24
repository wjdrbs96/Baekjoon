package Baekjoon.Java.BOJ1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 시간초과 메모리 초과
//public class Main_1325 {
//    static int[][] adj;
//    static boolean[] visited;
//    static int N;
//    static int M;
//    static int count[];
//    static int start = 1;
//
//    static void addEdge(int start, int end) {
//        adj[end][start] = 1; // 신뢰당하는 컴퓨터에서 신뢰하는 컴퓨터로만 갈 수 있게
//    }
//
//    static void bfs(int v) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(v);
//        visited[v] = true;
//
//        while (!queue.isEmpty()) {
//            int q = queue.poll();
//
//            for (int i = 1; i <= N; ++i) {
//                if (!visited[i] && adj[q][i] == 1) {
//                    queue.add(i);
//                    count[start]++;
//                }
//            }
//        }
//    }
//
//    static void dfs(int v) {
//        visited[v] = true;
//
//        for (int i = 1; i <= N; ++i) {
//            if (!visited[i] && adj[v][i] == 1) {
//                dfs(i);
//                count[start]++;
//            }
//        }
//    }
//
//    static void initial() {
//        for (int i = 1; i <= N; ++i) {
//            visited[i] = false;
//        }
//        start++;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//
//        adj = new int[N + 1][N + 1];
//        visited = new boolean[N + 1];
//        count = new int[N + 1];
//
//        for (int i = 0; i < M; ++i) {
//            st = new StringTokenizer(br.readLine());
//            addEdge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
//        }
//
//
//        for (int i = 1; i <= N; ++i) {
//            bfs(i);
//            //dfs(i);
//            visited = new boolean[N + 1];
//            start++;
//        }
//
//        int max = 0;
//
//        for (int i = 1; i <= N; ++i) {
//            if (max < count[i]) {
//                max = count[i];
//            }
//        }
//
//        for (int i = 1; i <= N; ++i) {
//            if (max == count[i]) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1325 {
    static int N,M;
    static boolean visit[];
    static int arr[];
    static ArrayList<Integer> arrList[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arrList = new ArrayList[N + 1];
        arr = new int[N + 1];

        for (int i = 1; i <= N; i++)
            arrList[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arrList[u].add(v);
        }

        for (int i = 1; i <= N; i++) {
            visit = new boolean[N + 1];
            bfs(i);
        }

        int max = 0;

        for (int i = 1; i <= N; i++) {
            max = Math.max(max, arr[i]);
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= N; i++) {
            if (arr[i] == max)
                sb.append(i + " ");
        }
        System.out.println(sb.toString());
    }
    public static void bfs(int index) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(index);
        visit[index] = true;

        while (!queue.isEmpty()) {
            int val = queue.poll();
            for (int i = 0; i < arrList[val].size(); i++) {
                int v = arrList[val].get(i);
                if (!visit[v]){
                    visit[v] = true;
                    arr[v]++;
                    queue.add(v);
                }
            }
        }
    }
    public static void dfs(int index) {
        visit[index] = true;

        for (int i = 0; i < arrList[index].size(); i++) {
            if (!visit[arrList[index].get(i)]) {
                arr[arrList[index].get(i)]++;
                dfs(arrList[index].get(i));
            }
        }
    }
}
