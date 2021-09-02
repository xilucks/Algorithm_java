package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_18352 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] dist = new int[N+1];
        boolean[] visit = new boolean[N+1];
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= N; i++){
            arr.add(new ArrayList<Integer>());
            dist[i] = -1;
        }
        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr.get(x).add(y);

        }
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        queue.offer(X);
        dist[X] = 0;
        int count = 0;
        while(! queue.isEmpty()){
            int x = queue.poll();
            for(int i = 0; i<arr.get(x).size();i++){
                int y = arr.get(x).get(i);
                if(dist[y] == -1){
                    dist[y] = dist[x]+1;
                    queue.offer(y);
                }
            }
        }
        for(int i = 0 ; i<=N; i++){
            if(dist[i] == K){
                sb.append(i+"\n");
                count++;
            }
        }
        if(count != 0){
            System.out.println(sb);
        }
        else{
            System.out.println(-1);
        }

    }
}
