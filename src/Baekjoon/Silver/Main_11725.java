package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_11725 {
    static ArrayList<ArrayList<Integer>> list;
    static boolean[] visit;
    static int[] arr;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        visit = new boolean[N+1];
        arr = new int[N+1];
        for(int i = 0; i<=N; i++){
            list.add(new ArrayList<Integer>());
        }
        StringTokenizer st;
        for(int i = 1; i<N; i++){
           st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b=  Integer.parseInt(st.nextToken());
           list.get(a).add(b);
           list.get(b).add(a);

        }
        dfs(1);
        for(int i = 2; i<=N; i++){
            System.out.println(arr[i]);
        }
    }
    static void dfs(int x){
        visit[x] = true;
        for(int i = 0; i<list.get(x).size();i++){
            int tmp = list.get(x).get(i);
            if (!visit[tmp]){
                dfs(tmp);
            }
            arr[tmp] = x;
        }

    }
}
