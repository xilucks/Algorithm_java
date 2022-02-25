package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_10026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int RGBans = 0;
        int RBans = 0;

        int dy[] = {1,0,-1,0};
        int dx[] = {0,1,0,-1};

        char[][] arr = new char[N][N];
        boolean[][] visit = new boolean[N][N];
        Queue<Integer[]> bfs = new LinkedList<>();


        for(int i = 0; i<N; i++){
            arr[i] = br.readLine().toCharArray();
        }
        //RGB

        for(int i = 0; i<N; i++){
            for(int j =0; j<N; j++){
               if(!visit[i][j]){
                   RGBans++;
                   bfs.offer(new Integer[]{i,j});
                   while (!bfs.isEmpty()){
                       Integer[] tmp = bfs.poll();
                       int y = tmp[0];
                       int x = tmp[1];
                       visit[y][x] = true;
                       char color = arr[y][x];
                       for(int k = 0; k <4; k++){
                           int ny = y +dy[k];
                           int nx = x +dx[k];

                           if(ny<0 || nx <0 || ny>= N || nx >= N) continue;
                           if(visit[ny][nx] || arr[ny][nx] != color) continue;

                           visit[ny][nx] = true;
                           bfs.offer(new Integer[]{ny,nx});
                       }
                   }
               }


            }
        }

        //RGandB
        for(int i = 0; i<N; i++){
            for(int j =0; j<N; j++){
                if(visit[i][j]){
                    RBans++;
                    bfs.offer(new Integer[]{i,j});
                    while (!bfs.isEmpty()){
                        Integer[] tmp = bfs.poll();
                        int y = tmp[0];
                        int x = tmp[1];
                        visit[y][x] = false;
                        char color = arr[y][x];
                        for(int k = 0; k <4; k++){
                            int ny = y +dy[k];
                            int nx = x +dx[k];
                            if(ny<0 || nx <0 || ny>= N || nx >= N) continue;
                            if(!visit[ny][nx]) continue;
                            if(color == 'R' && arr[ny][nx] == 'B') continue;
                            if(color == 'G' && arr[ny][nx] == 'B') continue;
                            if(color == 'B' && arr[ny][nx] != color) continue;

                            visit[ny][nx] = false;
                            bfs.offer(new Integer[]{ny,nx});
                        }
                    }
                }


            }
        }

        System.out.println(RGBans+" "+ RBans);

        //적록 색약






    }
}
