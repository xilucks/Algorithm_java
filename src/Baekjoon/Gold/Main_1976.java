package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_1976 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        visit = new boolean[N+1];
        for(int i = 0; i<= N; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=N; j++){
                int island = Integer.parseInt(st.nextToken());

                if (island == 1 ){
                    graph.get(i+1).add(j);
                    graph.get(j).add(i+1);
                }
            }
        }

        boolean ans = true;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(i == 0) dfs(tmp);
            if(!visit[tmp]){
                ans = false;
                break;
            }
        }
        if(ans) System.out.println("YES");
        else System.out.println("NO");
    }
    static void dfs(int x){
        visit[x] = true;
        for(int i = 0; i<graph.get(x).size(); i++){
            int tmp = graph.get(x).get(i);
            if(!visit[tmp]) dfs(tmp);
        }

    }
}
