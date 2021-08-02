package Hello_algo.Day_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main_2791 {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static int ans = 0;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        visited =  new boolean[N+1];
        for(int i = 0; i<= N; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 1; i <= N; i++){
            int x = Integer.parseInt(br.readLine());
            graph.get(i).add(x);
            graph.get(x).add(i);

        }
        dfs(0);
        System.out.println(ans);


    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void dfs(int x){
        visited[x] = true;
        for(int i = 0; i< graph.get(x).size(); i++){
            int y = graph.get(x).get(i);
            if(! visited[y]) {
                ans++;
                dfs(y);

            }

        }
    }

}
