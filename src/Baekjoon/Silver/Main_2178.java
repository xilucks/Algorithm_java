package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2178 {
    public static void main(String args[]) throws IOException {
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N+1][M+1];
        int[][] dist = new int[N+1][M+1];
        Queue<Integer []> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            String str = br.readLine();
            for(int j = 1 ; j <=M; j++){
                arr[i][j] = str.charAt(j-1)-48;
            }
        }

        dist[1][1] = 1;
        queue.offer(new Integer[] {1,1});

        while(! queue.isEmpty()){
            Integer[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];

            for(int i = 0 ; i <4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];

                if(nx < 1 || nx > N || ny <1 || ny > M){
                    continue;
                }

                if(arr[nx][ny] == 1 && dist[nx][ny] == 0){
                    dist[nx][ny] = dist[x][y]+1;

                    queue.offer(new Integer[] {nx,ny});
                }
            }
        }
        System.out.println(dist[N][M]);


    }
}
