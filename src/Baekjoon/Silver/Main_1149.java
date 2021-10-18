package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[3];
        int[][] arr = new int[N][3];
        for(int i = 0; i< N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<3; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i <N; i++){
            if (i == 0){
                dp[0] = arr[i][0];
                dp[1] = arr[i][1];
                dp[2] = arr[i][2];
            }
            else {
                int r = arr[i][0]+Math.min(dp[1],dp[2]);
                int g = arr[i][1]+Math.min(dp[0],dp[2]);
                int b = arr[i][2]+Math.min(dp[0],dp[1]);
                dp[0] = r; dp[1] =g; dp[2] = b;
            }
        }
        int ans = Math.min(dp[0],dp[1]);
        ans = Math.min(ans,dp[2]);
        System.out.println(ans);
    }
}
