package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1012 {
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] arr;
    static boolean[][] visit;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer[]> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T; i++){
            int ans = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            arr = new int[M][N];
            visit = new boolean[M][N];
            for(int j = 0 ; j < K; j++){
                st=  new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                arr[X][Y] = 1;
            }
            for(int a = 0; a < M; a++){
                for(int b= 0 ; b<N; b++){
                    if(arr[a][b] == 1 && !visit[a][b]){
                        visit[a][b] =true;
                        queue.offer(new Integer[]{a,b});
                        while(! queue.isEmpty()){
                            Integer[] tmp = queue.poll();
                            int x = tmp[0];
                            int y = tmp[1];
                            for(int k = 0; k<4; k++){
                                int nx = x + dx[k];
                                int ny = y + dy[k];

                                if(nx<0 || nx>= M || ny<0 || ny>=N){
                                    continue;
                                }
                                if(arr[nx][ny] == 1 && !visit[nx][ny]){
                                    visit[nx][ny]= true;
                                    queue.offer(new Integer[]{nx,ny});
                                }
                            }
                        }
                        ans++;

                    }
                }

            }
            sb.append(ans + "\n");

        }
        System.out.println(sb);


    }
}
