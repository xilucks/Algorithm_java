package Hello_algo.Day_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_3016 {

    static int N,M;
    static boolean[] visited;
    static int[] ans;
    static StringBuilder sb;


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        ans = new int[N+1];

        dfs(1);

        System.out.println(sb);
    }

    public static void dfs(int x){
        if (x == M+1) {
            for(int i = 1 ; i <= M; i++){
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
