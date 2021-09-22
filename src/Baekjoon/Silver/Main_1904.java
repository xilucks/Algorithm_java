package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1904 {
    /* top down
    static int[] dp;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
        System.out.println(cal(N));

    }
    static int cal(int x){
        if (x == 1){
            return 1;
        }
        else if (x == 2){
            return 2;
        }
        else if(dp[x] != 0){
            return dp[x];
        }
        else {
            return cal(x-2) + cal(x-1);
        }
    }

     */
    //bottom up
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        dp[1] = 1;
        if(N>1){
            dp[2] = 2;
            for(int i = 3; i<=N; i++){
                dp[i] = (dp[i-2] + dp[i-1])%15746;
            }
        }

        System.out.println(dp[N]);
    }
}
