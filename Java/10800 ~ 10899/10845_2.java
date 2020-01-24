package Java_Algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class Main_10845_2 {
    static LinkedList<Integer> list = new LinkedList<>();

    public static void push(int x) {
        list.add(x);
    }

    public static int pop() {
        if (list.isEmpty()) {
            return -1;
        }
        else {
            return list.pollFirst();
        }
    }

    public static int size() {
        return list.size();
    }

    public static int empty() {
        if (list.isEmpty()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int front() {
        if(list.isEmpty()) {
            return -1;
        }
        else {
            return list.getFirst();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;

        for (int i = 0; i < n; ++i) {
            String s = input.next();

            if (s.contains("push")) {
                a = input.nextInt();
                push(a);
            }

            else if (s.equals("pop")) {
                if (size() == 0) {
                    System.out.println(-1);
                }

                else {
                    System.out.println(pop());
                }
            }

            else if (s.equals("size")) {
                System.out.println(size());
            }

            else if (s.equals("empty")) {
                if (size() == 0) {
                    System.out.println(1);
                }

                else {
                    System.out.println(0);
                }
            }

            else if (s.equals("front")) {
                if (size()== 0) {
                    System.out.println(-1);
                }

                else {
                    System.out.println(front());
                }
            }

            else if (s.equals("back")) {
                if (size() == 0) {
                    System.out.println(-1);
                }

                else {
                    System.out.println(a);
                }
            }

        }
    }
}
