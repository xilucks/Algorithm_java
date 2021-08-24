package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1260 {
    static int N, M, V;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visit;
    static StringBuilder sb;
    static Queue<Integer> queue;
    public static void main(String args[]) throws IOException {
        sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i =0; i<=N;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i = 0 ;i<M; i++){
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        graph.get(x).add(y);
        graph.get(y).add(x);


        }

        visit = new boolean[N+1];

        for(int i =0; i<= N; i++){
            Collections.sort(graph.get(i));
        }
        queue = new LinkedList<>();

        dfs(V);

        visit = new boolean[N+1];
        sb.append("\n");
        bfs(V);

        System.out.println(sb);

    }
    public static void dfs(int x){
        visit[x] = true;
        sb.append(x+" ");
        for(int i = 0; i<graph.get(x).size(); i++){
            int tmp = graph.get(x).get(i);
            if(!visit[tmp]){
                dfs(tmp);
            }
        }

    }
    public static void bfs(int x){
        queue.offer(x);
        visit[x] = true;

        while(!queue.isEmpty()){
            int tmp = queue.poll();
            sb.append(tmp+" ");
            for(int i = 0; i<graph.get(tmp).size();i++){
                int tmp2 = graph.get(tmp).get(i);
                if(! visit[tmp2]){
                    queue.offer(tmp2);
                    visit[tmp2] = true;
                }
            }
        }



    }
}
