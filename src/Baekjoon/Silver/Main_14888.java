package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14888 {
    static int N;
    static int[] arr;
    static int[] cal = new int[5];
    static int max, min;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i<= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 1 ; i<= 4; i++){
            cal[i] = Integer.parseInt(st.nextToken());
        }

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        dfs(2,arr[1]);

        System.out.println(max);
        System.out.println(min);
    }
    static void dfs(int x, int y){
        if (x == N+1){
            max = Math.max(max, y);
            min = Math.min(min, y);
            return;
        }
        for (int i = 1 ; i<=4; i++){
            if (cal[i] != 0){
                cal[i] --;
                switch (i){
                    case 1:
                        dfs(x+1,y+arr[x]);
                        break;
                    case 2:
                        dfs(x+1,y-arr[x]);
                        break;
                    case 3:
                        dfs(x+1,y*arr[x]);
                        break;
                    case 4:
                        dfs(x+1, y/arr[x]);
                        break;

                }
                cal[i] ++;

            }
        }
    }
}
