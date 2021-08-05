package Hello_algo.Day_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class main_4695 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i<= N; i++){
            graph.add(new ArrayList<Integer>());
        }
        int[] dist = new int[N+1];

        for(int i = 0 ;i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        dist[X] = 1;
        queue.offer(X);
        while(!queue.isEmpty()){
            int num = queue.poll();
            for(int y : graph.get(num)){
                if(dist[y] == 0){
                    queue.offer(y);
                    dist[y] = dist[num]+1 ;
                }
            }

        }
        System.out.println(dist[Y]-1);



    }
}
