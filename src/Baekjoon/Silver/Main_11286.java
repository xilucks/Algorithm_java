package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main_11286 {
    public static void main(String args[]) throws IOException {
        PriorityQueue<Integer> ppq = new PriorityQueue<>();
        PriorityQueue<Integer> mpq = new PriorityQueue<>(Collections.reverseOrder());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                if(ppq.isEmpty() && mpq.isEmpty()){
                    sb.append(0+"\n");
                }
                else if(ppq.isEmpty()){
                    sb.append(mpq.poll()+"\n");
                }
                else if(mpq.isEmpty()){
                    sb.append(ppq.poll()+"\n");
                }
                else{
                    int a = Math.abs(ppq.peek());
                    int b = Math.abs(mpq.peek());
                    if(a == b){
                        sb.append(mpq.poll()+"\n");
                    }
                    else if(a>b){
                        sb.append(mpq.poll()+"\n");
                    }
                    else if (a<b){
                        sb.append(ppq.poll()+"\n");
                    }
                }
            }
            else{
                if(n > 0){
                    ppq.offer(n);
                }
                else{
                    mpq.offer(n);
                }
            }
        }
        System.out.println(sb);
    }
}
