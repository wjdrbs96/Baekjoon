package Baekjoon.Java.BOJ1400;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// BFS 이용
public class Main_1463 {
    static int n;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        check = new boolean[n + 1];

        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(n, 0));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int num = node.num;

            if (num == 1) {
                System.out.println(node.count);
                break;
            }

            if (num > 1 && !check[num]) {
                check[num] = true;
                int count = node.count + 1;
                if (num % 3 == 0) {
                    queue.offer(new Node(num / 3, count));
                }
                if (num % 2 == 0) {
                    queue.offer(new Node(num / 2, count));
                }
                queue.offer(new Node(num - 1, count));
            }
        }
    }

}

class Node {
    int num;
    int count;

    public Node(int num, int count) {
        this.num = num;
        this.count = count;
    }
}


