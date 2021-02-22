package Baekjoon.Java.BOJ1000;

import java.util.*;

//public class Main_1092 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int N = input.nextInt();  // 크레인 수
//        List<Integer> craneWeight = new ArrayList<>();
//
//        // 크레인 무게 제한
//        for (int i = 0; i < N; ++i) {
//            craneWeight.add(input.nextInt());   // 크레인 들 수 있는 무게 제한
//        }
//
//        int M = input.nextInt(); // 박스 수
//        List<Integer> boxWeight = new ArrayList<>();
//
//        for (int i = 0; i < M; ++i) {
//            boxWeight.add(input.nextInt());  // 박수 무게 제한
//        }
//
//        Collections.sort(craneWeight, (o1, o2) -> o2.compareTo(o1));
//        Collections.sort(boxWeight, (o1, o2) -> o2.compareTo(o1));
//
//        int timeCount = 0;
//
//        if (boxWeight.get(0) > craneWeight.get(0)) {
//            System.out.println("1");
//        }
//        else {
//            while (boxWeight.size() != 0) {
//                int idx = 0;
//                int tmp = 0;
//
//                while (idx < N) {
//                    if (tmp == boxWeight.size()) {
//                        break;
//                    }
//                    if (boxWeight.get(tmp) <= craneWeight.get(idx)) {
//                        boxWeight.remove(tmp);
//                        idx++;
//                    }
//                    else if (boxWeight.get(tmp) > craneWeight.get(idx)) {
//                        tmp++;
//                    }
//                }
//                timeCount++;
//            }
//            System.out.println(timeCount);
//        }
//
//    }
//}
import java.util.*;

public class Main_1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> craneList = new ArrayList<>(); // 크레인 중량
        ArrayList<Integer> boxList = new ArrayList<>(); // 박스 무게
        //1. 입력
        int n = sc.nextInt(); //크레인 갯수
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            craneList.add(a);
        }
        int m = sc.nextInt();//박스 갯수
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            boxList.add(a);
        }
        //2. 내림차순 정렬
        Descending descending = new Descending();
        Collections.sort(craneList, descending);
        Collections.sort(boxList, descending);
        int time = 0;//걸린 시간
        //3. 가장 무거운 박스의 무게 > 크레인 최대 중량일 경우
        if (boxList.get(0) > craneList.get(0))
            System.out.println("-1");
            //4. 그 외의 경우, 그리디 알고리즘
        else {
            while (boxList.size() != 0) {
                int idx = 0;
                int tmp = 0;
                while (idx < n) {
                    if (tmp == boxList.size())
                        break;
                    if (boxList.get(tmp) <= craneList.get(idx)) {
                        boxList.remove(tmp);
                        idx++;
                    } else if (boxList.get(tmp) > craneList.get(idx)) {
                        tmp++;
                    }
                }
                time++;
            }
            System.out.println(time);
        }
        sc.close();
    }
}

class Descending implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}

