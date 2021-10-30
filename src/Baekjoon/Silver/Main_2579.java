package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stair = new int[N+1];
        int[][] dp = new int[N+1][2];
        // dp[][0]은 전 걸 밟음, dp[][1]은 전걸 안밟음
        for(int i =1; i<=N; i++){
            int point = Integer.parseInt(br.readLine());
            stair[i] = point;
        }
        for(int i = 1; i<=N; i++){
             if(i == 1){
                 dp[i][0] = stair[i];
                 dp[i][1] = stair[i];
             }
             else{
                 dp[i][0] = dp[i-1][1] + stair[i];
                 dp[i][1] = Math.max(dp[i-2][0],dp[i-2][1]) + stair[i];
             }

        }
        int answer = Math.max(dp[N][0],dp[N][1]);
        System.out.println(answer);
    }
}
