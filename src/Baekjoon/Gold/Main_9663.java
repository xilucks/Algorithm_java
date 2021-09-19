package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9663 {
    static int N;
    static int ans;
    static int[] arr;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr= new int[N+1];
        ans = 0;
        dfs(1);

        System.out.println(ans);

    }
    public static void dfs(int x){
        if (x == N+1){
            ans++;
            return;
        }

        for (int i = 1;  i<= N; i++){
            boolean state = true;
            for (int j = 1; j<x; j++){
                if(i == arr[j] || i + x == j+arr[j] || x - i == j - arr[j]){
                    state = false;
                }
            }

            if(state){
                arr[x] = i;
                dfs(x+1);
                arr[x] = 0;
            }
        }
    }
}
