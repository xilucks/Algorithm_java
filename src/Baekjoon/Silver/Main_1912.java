package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N+1];
        int[] dp = new int[N+1];
        for(int i = 1; i<=N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = Integer.MIN_VALUE;
        for(int i = 1; i<=N; i++){
            dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);
            if (dp[i] > max) max = dp[i];
        }
        System.out.println(max);

    }
}
