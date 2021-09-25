package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2206 {
    public static void main(String[] args) throws IOException {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int ans = Integer.MAX_VALUE;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N+1][M+1];
        int[][] dist1 = new int[N+1][M+1];
        int[][] dist2 = new int[N+1][M+1];

        for(int i = 1; i<= N; i++){
            String str = br.readLine();
            for(int j = 1; j<=M; j++){
                arr[i][j] = str.charAt(j-1) - '0';
            }
        }


        Queue<Integer[]> bfs = new LinkedList<>();

        dist1[1][1] = 1;

        bfs.offer(new Integer[] {1,1});

        while(! bfs.isEmpty()){
            Integer[] tmp = bfs.poll();
            int y = tmp[0];
            int x = tmp[1];

            for(int i = 0; i<4; i++){
                int ny = y +dy[i]; int nx = x + dx[i];
                if(ny < 1 || ny > N || nx < 1 || nx > M){
                    continue;
                }

                if(dist1[ny][nx] == 0){
                    dist1[ny][nx] = dist1[y][x] + 1;
                    if(arr[ny][nx] == 0){
                        bfs.offer(new Integer[] {ny,nx});
                    }
                }
            }
        }

        bfs = new LinkedList<>();
        dist2[N][M] = 1;
        bfs.offer(new Integer[] {N,M});
        while(! bfs.isEmpty()){
            Integer[] tmp = bfs.poll();
            int y = tmp[0];
            int x = tmp[1];

            for(int i = 0; i<4; i++){
                int ny = y +dy[i], nx = x+dx[i];

                if(ny < 1 || ny > N || nx < 1 || nx > M) {
                    continue;
                }

                if(dist2[ny][nx] == 0){
                    dist2[ny][nx] = dist2[y][x]+1;

                    if(arr[ny][nx] == 0){
                        bfs.offer(new Integer[] {ny,nx});
                    }
                }
            }

        }

        for(int i = 1; i <= N; i++){
            for(int j = 1; j<= M; j++){
                if(dist1[i][j] == 0 || dist2[i][j] == 0) continue;
                int num = dist1[i][j] + dist2[i][j] - 1;
                ans = Math.min(ans, num);
            }
        }

        if(ans == Integer.MAX_VALUE) {
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }


    }
}
