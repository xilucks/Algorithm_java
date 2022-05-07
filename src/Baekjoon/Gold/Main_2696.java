package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_2696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;

        int t = Integer.parseInt(br.readLine());

        for(int c = 0; c < t; c++){
            StringBuilder sb = new StringBuilder();
            left = new PriorityQueue<>(Collections.reverseOrder());
            right = new PriorityQueue<>();

            int n = Integer.parseInt(br.readLine());
            int center = Integer.MIN_VALUE;
            int count = 0;

            for(int i = 0; i<n; i++){
                if(i%10 ==0){
                    st = new StringTokenizer(br.readLine(), " ");
                }
                int num = Integer.parseInt(st.nextToken());
                if(i == 0){
                    center = num;
                    sb.append(center +" ");
                    count++;
                    continue;
                }
                else{
                    if(num >= center){
                        right.add(num);
                    }
                    else{
                        left.add(num);
                    }
                }

                if(left.size() > right.size()+1){
                    right.add(center);
                    center = left.poll();
                }
                else if(right.size() > left.size()+1){
                    left.add(center);
                    center = right.poll();
                }

                if(i%2 == 0){
                    sb.append(center +" ");
                    count ++;
                    if(count%10 == 0){
                        sb.append("\n");
                    }
                }

            }
            System.out.println((n+1)/2);
            System.out.println(sb);

        }

    }
}
