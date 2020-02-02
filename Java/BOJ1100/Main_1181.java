package Baekjoon.Java.BOJ1100;
import java.util.*;

public class Main_1181{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int n = input.nextInt();
        for (int i = 0; i < n; ++i) {
            set.add(input.next());
        }

        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String v1, String v2) {
                if(v1.length() > v2.length())
                    return 1;
                else if(v1.length() < v2.length())
                    return -1;
                else
                    return v1.compareTo(v2);
            }
        });

        for(String s : list)
            System.out.println(s);
    }
}
