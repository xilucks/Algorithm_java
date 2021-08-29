package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main_11279 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< N; i++){
            int item = Integer.parseInt(br.readLine());
            if(item == 0){
                if(pq.isEmpty()){
                    sb.append(0+"\n");
                }
                else{
                    sb.append(pq.poll()+"\n");
                }
            }
            else{
                pq.offer(item);
            }
        }
        System.out.println(sb);
    }
}
