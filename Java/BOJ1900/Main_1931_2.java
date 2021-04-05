package Baekjoon.Java.BOJ1900;

import java.util.*;

/**
 * created by jg 2021/04/06
 */
public class Main_1931_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        List<Save> saveList = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            saveList.add(new Save(input.nextInt(), input.nextInt()));
        }

        saveList.sort(new Comparator<Save>() {
            @Override
            public int compare(Save o1, Save o2) {
                if (o1.y == o2.y) return o1.x - o2.x;
                return o1.y - o2.y;
            }
        });

        int count = 1;
        Save save1 = saveList.get(0);
        for (int i = 1; i < N; ++i) {
            Save save2 = saveList.get(i);
            if (save1.y <= save2.x) {
                count++;
                save1 = save2;
            }
        }
        System.out.println(count);
    }
}

class Save {
    int x;
    int y;

    public Save(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
