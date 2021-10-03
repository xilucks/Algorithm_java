package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_1707 {
    static int[] color;
    static int V,E;
    static ArrayList<ArrayList<Integer>> arr;
    static boolean ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        for (int i  = 0; i<C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ans = true;
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());
            color = new int[V+1];
            arr = new ArrayList<>();
            for(int j = 0; j<=V; j++){
                arr.add(new ArrayList<Integer>()) ;
            }
            for(int j = 0; j<E; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr.get(x).add(y);
                arr.get(y).add(x);
            }

            for(int j = 1; j<= V; j++){
                if(color[j] == 0){
                    dfs(j,1);
                }
            }

            if (ans) System.out.println("YES");
            else System.out.println("NO");

        }
    }
    public static void dfs(int x, int c){
        color[x] = c;
        for(int i = 0; i < arr.get(x).size(); i++){
            int y = arr.get(x).get(i);
            if(color[y] == color[x]) {
                ans = false;
            }
            if(color[y] == 0){
                dfs(y, 3-c);
            }
        }

    }

}
