package Hello_algo.Day_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class main_4697 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int[] dist = new int [200001];

        Queue<Integer> queue = new LinkedList<>();
        dist[X] = 1;
        queue.offer(X);

        while(!queue.isEmpty()){
            int x = queue.poll();
            if(x+1 <= 200000 && dist[x+1] == 0){
                dist[x+1] = dist[x]+1;
                queue.offer(x+1);
            }
            if(x-1 >=0 && dist[x-1] == 0){
                dist[x-1] = dist[x]+1;
                queue.offer(x-1);
            }
            if(x*2 <= 200000 && dist[x*2] == 0){
                dist[x*2] = dist[x]+1;
                queue.offer(x*2);
            }
        }

        System.out.println(dist[Y]-1);
    }
}
