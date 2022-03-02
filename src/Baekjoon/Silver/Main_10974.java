package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10974 {
    static int N;
    static boolean[] visit;
    static int[] arr;
    static int[] nums;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        nums = new int[N];
        visit = new boolean[N];
        sb = new StringBuilder();

        for(int i = 0; i<N; i++){
            nums[i] = i+1;
        }
        dfs(0);
        System.out.println(sb);


    }

    public static void dfs(int x){
        if(x == N){
            for(int num : arr){
                sb.append(num+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0; i<N; i++){
            if(!visit[i]){
                arr[x] = nums[i];
                visit[i] = true;
                dfs(x+1);
                arr[x] = 0;
                visit[i]=false;
            }
        }

    }
}
