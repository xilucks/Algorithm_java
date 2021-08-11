package Hello_algo.Day_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main_4067 {
    static int dt[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dt = new int[n+1];

        System.out.println(dp(n));


    }

    static int dp(int x){
        if(x==1)
            return 1;

        if(x==2) return 2;


        if(dt[x] != 0) {
            return dt[x];
        }

        return dt[x] = (dp(x-1)+dp(x-2))%10007;


    }
}
