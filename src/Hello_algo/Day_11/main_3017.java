package Hello_algo.Day_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_3017 {

    static int N,M;
    static int[] ans;
    static StringBuilder sb;


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ans = new int[N+1];

        dfs(1, 1);

        System.out.println(sb);
    }

    public static void dfs(int x, int p){
        if (x == M+1) {
            for(int i = 1 ; i <= M; i++){
                sb.append(ans[i]+" ");
            }
            sb.append("\n");
            return;

        }
        for (int i = p; i + (M-x) <= N; i++){
                ans[x] = i;
                dfs(x+1, i+1);
                ans[x] = 0;
            }
        }
    }

