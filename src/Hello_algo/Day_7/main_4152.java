package Hello_algo.Day_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class main_4152 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            pq.add(x);
        }

        int sum = 0;
        int count = 0;

        while (pq.size() != 1){       //30    40   50     60             70 110 180
            int a = pq.poll();
            int b = pq.poll();        //70
            pq.offer(a+b);          //
            sum += a+b;
        }



        System.out.println(sum);

    }
}
