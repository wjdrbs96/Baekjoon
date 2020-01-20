package Java_Algorithm;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_11728 {
    public static void main(String[] args) throws IOException {

        // 첫번 째 풀이 시간초과

        /*Scanner input = new Scanner(System.in);
        시간 초과남 짜증난다

        int n = input.nextInt();
        int m = input.nextInt();
        LinkedList<Integer> A = new LinkedList<>();

        for (int i = 0; i < n; ++i) {
           A.add(input.nextInt());
        }

        for (int i = 0; i < m; ++i) {
            A.add(input.nextInt());
        }

        Collections.sort(A);

        for (Integer k : A) {
            System.out.print(k + " ");
        }*/

        // 두번 째 풀이 시간초과

      /*  Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; ++i) {
            pq.offer(input.nextInt());
        }

        for (int i = 0; i < m; ++i) {
            pq.offer(input.nextInt());
        }


        while(!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }*/


      // 구글 풀이 입력과 출력을 다른걸 써야하니 그거에 대해 공부해봐야지
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue pq = new PriorityQueue<>();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens())
            pq.offer(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens())
            pq.offer(Integer.parseInt(st.nextToken()));

        while(!pq.isEmpty())
            bw.write(pq.poll()+" ");

        bw.close();
    }
}
