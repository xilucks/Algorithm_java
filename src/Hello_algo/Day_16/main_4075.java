package Hello_algo.Day_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_4075 {
    static int arr[][];
    static int dp[][];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        dp = new int[n+1][n+1];

        for(int i = 1 ; i<=n; i++){
            String str = br.readLine();
            for(int j =0; j< n; j++){
                char ch  = str.charAt(j);
                if (ch == '.'){
                    arr[i][j+1] = 1;

                }
                if (ch == '*'){
                    arr[i][j+1] = -1;
                }
            }
        }

        dp[1][1] = 1;


        for(int i = 1 ; i <= n; i++){

            for(int j = 1 ; j<=n ; j++){

                if (i ==1 && j==1){
                    continue;
                }
                else if(arr[i][j]== -1) {
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = (dp[i-1][j] + dp[i][j-1])% 1000000007;
                }
            }
        }
        if(arr[1][1] == -1){
            System.out.println(0);
        }
        else System.out.println(dp[n][n]);



    }
}
