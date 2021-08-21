package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_2606 {
    static ArrayList<ArrayList<Integer>> list;
    static boolean visit[];
    static int ans =0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        list = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= N; i++){
            list.add(new ArrayList<Integer>());
        }
        visit = new boolean[N+1];
        for(int i = 0; i<C ; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.get(x).add(y);
            list.get(y).add(x);
        }
        dfs(1);
        System.out.println(ans);

    }
    static void dfs(int x){
        visit[x] = true;
        for(int i = 0; i <list.get(x).size(); i++){
            int y = list.get(x).get(i);
            if(! visit[y]){
                ans++;
                dfs(y);
            }
        }
    }
}
