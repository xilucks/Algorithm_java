package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1182 {
    static int N, S;
    static int[] arr;
    static int ans = 0;

    static StringBuilder sb = new StringBuilder();
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0, 0);
        if (S == 0) ans--;
        System.out.println(ans);

    }
    public static void dfs(int x,int y){
        if (x == N){
            if(y == S){
                ans++;
            }
            return;
        }
        dfs(x+1, y+arr[x]);
        dfs(x+1 , y);

    }
}
