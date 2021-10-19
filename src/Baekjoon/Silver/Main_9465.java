package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        int[][] arr, dp;
        StringBuilder sb = new StringBuilder();
        for(int c = 0; c<C; c++){
            int N = Integer.parseInt(br.readLine());
            arr = new int[2][N];
            dp = new int[2][N];
            int ans = 0;
            for(int i = 0; i<2; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j <N; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int i = 0 ; i<N; i++){
                if(i == 0){
                    dp[0][i] = arr[0][i];
                    dp[1][i] = arr[1][i];
                }
                else if(i==1){
                    dp[0][i] = arr[0][i] + dp[1][i-1];
                    dp[1][i] = arr[1][i] + dp[0][i-1];
                }
                else{
                    dp[0][i] = arr[0][i] + Math.max(Math.max(dp[0][i-2],dp[1][i-2]),dp[1][i-1]);
                    dp[1][i] = arr[1][i] + Math.max(Math.max(dp[1][i-2],dp[0][i-2]),dp[0][i-1]);
                }

                ans = Math.max(Math.max(dp[0][i],dp[1][i]),ans);
            }
            sb.append(ans+"\n");
        }
        System.out.println(sb);
    }
}
