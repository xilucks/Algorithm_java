package Hello_algo.Day_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main_4154 {

    static int N;
    static boolean[] visited;
    static int[] ans;
    static StringBuilder sb;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        visited = new boolean[N+1];
        ans = new int[N+1];

        dfs(1);

        System.out.println(sb);


    }

    public static void dfs(int x){
        if (x == N+1){
            for(int i = 1 ; i <= N; i++){
                sb.append(ans[i]+" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++){
            if(! visited[i]){
                ans[x] = i;
                visited[i] = true;
                dfs(x+1);
                ans[x] = 0;
                visited[i] = false;
            }
        }

    }
}
