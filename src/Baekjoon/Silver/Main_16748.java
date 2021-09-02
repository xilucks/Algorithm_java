package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_16748 {
    public static void main(String args[]) throws IOException {
        int[] dx = {-2,-2,0,0,2,2};
        int[] dy = {-1,1,-2,2,-1,1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());

        Queue<Integer[]> queue = new LinkedList<>();
        int[][] dist = new int[N][N];
        dist[r1][c1] = 1;
        queue.offer(new Integer[]{r1,c1});
        while(! queue.isEmpty()){
            Integer[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            if(x == r2 && y == c2){
                break;
            }
            for(int i = 0 ; i<6; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];

                if(nx<0||nx>=N || ny<0 || ny>=N){
                    continue;
                }
                if(dist[nx][ny] == 0){
                    dist[nx][ny] = dist[x][y]+1;
                    queue.offer(new Integer[]{nx,ny});
                }
            }
        }
        System.out.println(dist[r2][c2]-1);
    }
}
