package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_11724 {
    static int N,M,ans;
    static boolean[] visit;
    static ArrayList<ArrayList<Integer>> arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new ArrayList<>();
        ans = 0;

        for(int i = 0; i<=N; i++){
            arr.add(new ArrayList<Integer>());
        }
        visit = new boolean[N+1];
        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr.get(x).add(y);
            arr.get(y).add(x);
        }

        for(int i = 1; i<=N;i++){
            if(!visit[i]){
                dfs(i);
                ans++;
            }
        }

        System.out.println(ans);



    }
    static void dfs(int x){
        visit[x] = true;
        for(int i = 0 ; i <arr.get(x).size();i++){
            int tmp = arr.get(x).get(i);
            if(!visit[tmp]){
                dfs(tmp);
            }
        }
    }

}
