package Hello_algo.Day_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_4070 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] dp = new int[n+1];
        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<x;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 1;
        for(int i = 1; i<= n; i++){
            dp[i] = 0;
            for(int j = 0; j < x ; j++){
                if(i-arr[j]>=0){
                    dp[i] += dp[i - arr[j]];
                    dp[i] %= 1000000007;
                }
            }

        }
        System.out.println(dp[n]);


    }
}
