package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1937 {
    static int N;
    static int[][] map;
    static int[][] visit;
    static StringTokenizer st;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int count;
    static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map= new int[N][N];
        visit = new int[N][N];
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                ans = Math.max(ans, dfs(i,j));
            }
        }

        System.out.println(ans+1);


    }
    static int dfs(int y, int x){
        if(visit[y][x] != 0){
            return visit[y][x];
        }
        for(int i = 0; i < dx.length; i++){
            int ny = y+dy[i];
            int nx = x+dx[i];

            if(ny<0 || nx <0|| ny>=N || nx >= N) continue;
            if(map[y][x] < map[ny][nx]){
                visit[y][x] = Math.max(visit[y][x], dfs(ny,nx)+1);
                dfs(ny, nx);
            }
        }
        return visit[y][x];


    }
}
