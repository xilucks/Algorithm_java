package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_1463 {
    static int[] arr;
    static int ans = 0;
    static int N;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        cal();
        System.out.println(arr[N]);


    }
    static void cal(){
        Queue<Integer> queue  = new LinkedList<>();
        arr[1] = 0;
        queue.offer(1);
        while(!queue.isEmpty()){
            int tmp = queue.poll();

            if(tmp * 3 <= N && arr[tmp*3] == 0){
                arr[tmp*3] = arr[tmp]+1;
                queue.offer(tmp*3);
            }
            if(tmp * 2 <= N && arr[tmp*2] == 0){
                arr[tmp*2] = arr[tmp]+1;
                queue.offer(tmp*2);
            }
            if(tmp + 1 <=N && arr[tmp+1] == 0){
                arr[tmp+1] = arr[tmp]+1;
                queue.offer(tmp+1);
            }
        }
    }
}
