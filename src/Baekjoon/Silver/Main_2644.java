package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2644 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());   //start
        int Y = Integer.parseInt(st.nextToken());   //Target
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[] dist = new int[N+1];
        for(int i = 0; i<= N; i++){
            list.add(new ArrayList<Integer>());
        }
        int M = Integer.parseInt(br.readLine());
        for(int i = 0; i <M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list.get(x).add(y);
            list.get(y).add(x);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(X);
        dist[X] = 1;
        while(! queue.isEmpty()){
            int x = queue.poll();
            for(int i = 0; i < list.get(x).size(); i++){
                int index = list.get(x).get(i);
                if(dist[index] == 0 ){
                    dist[index] = dist[x]+1;
                    queue.offer(index);
                }
            }
        }
        if(dist[Y] == 0 ){
            System.out.println(-1);
        }
        else{
            System.out.println(dist[Y]-1);
        }
    }
}
