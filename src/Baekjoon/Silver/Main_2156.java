package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        //0은 전껄 마신거구요 1은 전껄 안마신겁니다.
        int[][] dp = new int[N+1][2];
        for(int i = 1; i<= N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int Max = Integer.MIN_VALUE;
        for(int i = 1; i<=N; i++){
            if(i==1){
                dp[i][0] = arr[i];
                dp[i][1] = arr[i];
                int tmp = Math.max(dp[i][0],dp[i][1]);
                Max = Math.max(tmp,Max);
            }
            else{
                dp[i][0] = dp[i-1][1] + arr[i];
                dp[i][1] = Math.max(dp[i-2][0],dp[i-2][1]) + arr[i];
                dp[i][1] = Math.max(dp[i][1],Max);
                int tmp = Math.max(dp[i][0],dp[i][1]);
                Max = Math.max(tmp,Max);
            }
        }
        System.out.println(Max);

    }
}
