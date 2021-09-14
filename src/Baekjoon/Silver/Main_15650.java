package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15650 {
    static int N,M;
    static StringBuilder sb;
    static int[] arr;
    static boolean[] visit;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();

        arr = new int[N+1];
        visit = new boolean[N+1];

        dfs(1, 1);

        System.out.println(sb);


    }


    public static void dfs(int x, int y){
        if (x == M+1){
            for(int i = 1; i<=M; i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = y; i<= N; i++){
                arr[x] = i;
                dfs(x+1, i+1);
                arr[x] = 0;

        }

    }
}
