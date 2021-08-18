package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main_1655 {
    public static void main(String args[]) throws IOException {
        PriorityQueue<Integer> MinHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int mid = 100001;
        for(int i = 0; i < N ; i++){
            int n = Integer.parseInt(br.readLine());
            if(mid == 100001 && MinHeap.isEmpty() && MaxHeap.isEmpty()){
                mid = n;
            }
            else{
                if(n >= mid){
                    MaxHeap.offer(n);
                }
                if(n < mid){
                    MinHeap.offer(n);
                }
                if(MaxHeap.size() >= MinHeap.size()+2){
                    MinHeap.offer(mid);
                    mid = MaxHeap.poll();
                }
                else if(MaxHeap.size() < MinHeap.size()){
                    MaxHeap.offer(mid);
                    mid = MinHeap.poll();
                }


            }
            sb.append(mid+"\n");
        }

        System.out.println(sb);


    }

}
