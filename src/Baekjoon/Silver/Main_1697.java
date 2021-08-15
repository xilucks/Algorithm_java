package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1697 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int ans = 0;
        int[] arr = new int[100001];
        arr[S] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(S);
        while(!queue.isEmpty()){
            int x = queue.poll();
            int one = 2*x;
            int two = x+1;
            int tr = x-1;
            if(one >= 0&& one < 100001 && arr[one] == 0){
                queue.offer(one);
                arr[one] = arr[x]+1;
            }
            if(two >= 0 && two < 100001 && arr[two] == 0){
                queue.offer(two);
                arr[two] = arr[x]+1;
            }
            if(tr >= 0 && tr<100001 && arr[tr] == 0){
                queue.offer(tr);
                arr[tr] = arr[x]+1;
            }
        }
        System.out.println(arr[E]-1);

    }
}
