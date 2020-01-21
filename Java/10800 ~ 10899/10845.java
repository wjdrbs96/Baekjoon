package Java_Algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_10845 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = input.nextInt();
        int a = 0;

        for (int i = 0; i < n; ++i) {
            String s = input.next();

            if (s.contains("push")) {
                a = input.nextInt();
                queue.offer(a);
            }

            else if (s.equals("pop")) {
                if (queue.size() == 0) {
                    System.out.println(-1);
                }

                else {
                    System.out.println(queue.poll());
                }
            }

            else if (s.equals("size")) {
                System.out.println(queue.size());
            }

            else if (s.equals("empty")) {
                if (queue.size() == 0) {
                    System.out.println(1);
                }

                else {
                    System.out.println(0);
                }
            }

            else if (s.equals("front")) {
                if (queue.size() == 0) {
                    System.out.println(-1);
                }

                else {
                    System.out.println(queue.peek());
                }
            }

            else if (s.equals("back")) {
                if (queue.size() == 0) {
                    System.out.println(-1);
                }

                else {
                    System.out.println(a);
                }
            }

        }

    }
}
