package Baekjoon.Java.BOJ1900;

import java.util.*;

public class Main_1946 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();  // 테스트 케이스 수

        for (int i = 0; i < t; ++i) {
            int N = input.nextInt();
            List<Person> listScore = new ArrayList<>();

            for (int j = 0; j < N; ++j) {
                int documentLank = input.nextInt();
                int interviewLank = input.nextInt();
                listScore.add(new Person(documentLank, interviewLank));
            }

            // 인터뷰 등수로 정렬
            Collections.sort(listScore, ((o1, o2) -> o1.interviewLank - o2.interviewLank));

            int count = 1;
            Person person1 = listScore.get(0);
            for (int k = 1; k < listScore.size(); ++k) {
                Person person2 = listScore.get(k);
                if (person1.documentLank > person2.documentLank) {
                    count++;
                    person1 = person2;
                }
            }
            System.out.println(count);
        }
    }
}

class Person {
    int documentLank;
    int interviewLank;

    public Person(int documentLank, int interviewLank) {
        this.documentLank = documentLank;
        this.interviewLank = interviewLank;
    }
}