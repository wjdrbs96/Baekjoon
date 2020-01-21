package Java_Algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class Main_2920 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer,String> hm = new HashMap<>();
        int[] list = new int[8];
        String s = new String();
        //처음에 StringBuilder 로 해서 아래 for 문에서 append 했는데 if 문에서 equals가 먹지를 않길래
        //왜지? 라고 생각하고 자바 API 들어가서 확인해보니 StringBuilder는 equals가 없고 Object클래스의 equals 였다
        //Object의 equals는 같은 객체여야 true 여서 안됐다.

        hm.put(1,"c"); hm.put(2,"d"); hm.put(3,"e"); hm.put(4,"f");
        hm.put(5,"g"); hm.put(6,"a"); hm.put(7,"b"); hm.put(8,"C");

        for (int i = 0; i < 8; ++i) {
            list[i] = input.nextInt();
            s = s.concat(hm.get(list[i]));
        }


        if (s.equals("cdefgabC")) {
            System.out.println("ascending");
        }

        else if (s.equals("Cbagfedc")) {
            System.out.println("descending");
        }

        else {
            System.out.println("mixed");
        }
    }
}
