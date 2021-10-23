package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2096 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][]dp = new int[3][2];
        for(int i = 0; i<N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(i == 0){
                dp[0][0] = a;
                dp[0][1] = a;
                dp[1][0] = b;
                dp[1][1] = b;
                dp[2][0] = c;
                dp[2][1] = c;
            }
            else {
                int tmp1 = dp[0][0], tmp2 = dp[1][0], tmp3 = dp[2][0];
                int tmp4 = dp[0][1], tmp5 = dp[1][1], tmp6 = dp[2][1];
                dp[0][0] = Math.max(tmp1,tmp2) + a;
                dp[0][1] = Math.min(tmp4,tmp5) + a;
                dp[1][0] = Math.max(Math.max(tmp1,tmp2),tmp3) + b;
                dp[1][1] = Math.min(Math.min(tmp4,tmp5),tmp6) + b;
                dp[2][0] = Math.max(tmp2,tmp3) + c;
                dp[2][1] = Math.min(tmp5,tmp6) + c;
            }
        }
        int max = Math.max(Math.max(dp[0][0],dp[1][0]),dp[2][0]);
        int min = Math.min(Math.min(dp[0][1],dp[1][1]),dp[2][1]);
        System.out.println(max+" "+min);
    }
}
