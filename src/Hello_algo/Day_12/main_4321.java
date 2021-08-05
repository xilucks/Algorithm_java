package Hello_algo.Day_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main_4321 {
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
    static boolean[] visited;
    static int N;
    static int M;
    static int V;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i<=N; i++){
            arr.add(new ArrayList<Integer>());
        }
        visited = new boolean[N+1];

        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr.get(x).add(y);
            arr.get(y).add(x);
        }
        for(int i = 0; i<=N; i++){
            Collections.sort(arr.get(i));
        }
        dfs(V);
        sb.append("\n");


        Queue<Integer> queue =new LinkedList<Integer>();
        visited = new boolean[N+1];

        queue.offer(V);
        visited[V] = true;
        while(!queue.isEmpty()){
            int x = queue.poll();
            sb.append(x+" ");
            for(int y : arr.get(x)){
                if(!visited[y]){
                    queue.offer(y);
                    visited[y] = true;
                }
            }
        }

        System.out.println(sb);


    }
    static StringBuilder sb = new StringBuilder();
    public static void dfs(int x){
        visited[x] = true;
        sb.append(x+" ");
        for(int i = 0; i< arr.get(x).size(); i++){
            int y = arr.get(x).get(i);
            if(! visited[y]) {
                dfs(y);
            }
        }
    }
}
