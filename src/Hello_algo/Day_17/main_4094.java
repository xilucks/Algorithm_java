package Hello_algo.Day_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_4094 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int D = Integer.parseInt(br.readLine());
        int[][] dp = new int[D+1][3];

        for(int i = 1; i<=D ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + x;
            dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + y;
            dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + z;

        }
        System.out.println(Math.max(dp[D][0],Math.max(dp[D][1],dp[D][2])));

    }
}
