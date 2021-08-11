package Hello_algo.Day_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main_4069 {
    static int dt[];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < C; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp(n)+"\n");
        }

        System.out.println(sb);
    }

    static int dp(int x) {
        if (x == 1) {
            return 1;
        }
        if (x == 2) {
            return 2;
        }
        if (x == 3) {
            return 4;
        }
        return dp(x - 1) + dp(x - 2) + dp(x - 3);

    }
}
