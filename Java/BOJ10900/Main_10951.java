package Baekjoon.Java.BOJ10900;

import java.util.Scanner;

public class Main_10951 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {  //int 형인 것만 while 루트 들어감
// 이 hasNextInt()메소드는 true를 리턴 합니다int . 로 읽을 수 없거나 파일 int이 너무 //커서 int또는 파일 끝에 도달하면 false를 반환합니다 . hasNextInt()자체는 문자를 소//비하지 않습니다.
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a + b);
        }
    }
}
