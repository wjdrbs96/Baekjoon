package Baekjoon.Java.BOJ1900;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_1931 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        List<Session> listSession = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            int a = input.nextInt();
            int b = input.nextInt();

            listSession.add(new Session(a, b));
        }

        // 회의 종료 시간 정렬 (종료 시간이 빠르면 더 많은 활동을 할 수 있다)
        Collections.sort(listSession, ((o1, o2) -> {
            if (o1.endTime == o2.endTime) return o1.startTime - o2.startTime;
            return o1.endTime - o2.endTime;
        }));

        Session session1 = listSession.get(0);
        int count = 1;

        for (int i = 1; i < listSession.size(); ++i) {
            Session session2 = listSession.get(i);

            if (session1.endTime <= session2.startTime) {
                count++;
                session1 = session2;
            }
        }

        System.out.println(count);
    }
}

class Session {
    int startTime;
    int endTime;

    public Session(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}