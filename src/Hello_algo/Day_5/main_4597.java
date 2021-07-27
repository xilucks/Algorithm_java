package Hello_algo.Day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class main_4597 {
    public static void main(String args[]) throws IOException {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i =0; i<n ; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if(num != 0){
                pq.offer(num);
            }
            else{
                if(pq.isEmpty()){
                    sb.append(0+"\n");
                }
                else{
                    sb.append(pq.poll() + "\n");
                }
            }
        }

        System.out.println(sb);



    }
}
