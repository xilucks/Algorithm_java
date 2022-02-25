package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2468 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];

        int[] dy = {1,0,-1,0};
        int[] dx = {0,1,0,-1};
        int max = 0;
        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                int n = Integer.parseInt(st.nextToken());
                arr[i][j] = n;
                if (arr[i][j] > max) max = arr[i][j];
            }
        }

        boolean[][] visit;

        Queue<Integer[]> bfs = new LinkedList<>();

        int ans = 0;
        for(int now = -1; now <= max; now++){
            visit = new boolean[N][N];
            int count = 0;
            for(int i =0; i<N; i++){
                for(int j = 0; j<N; j++){
                    if(!visit[i][j] && arr[i][j] > now){
                        count++;
                        visit[i][j] = true;
                        bfs.offer(new Integer[]{i, j});

                        while (! bfs.isEmpty()){
                            Integer[] tmp = bfs.poll();
                            int y = tmp[0];
                            int x = tmp[1];

                            for(int k =0; k<4; k++){
                                int ny = y+dy[k];
                                int nx = x+dx[k];

                                if(nx<0 || ny <0 || nx>=N || ny >= N) continue;
                                if(visit[ny][nx] || arr[ny][nx] <= now) continue;
                                visit[ny][nx] = true;
                                bfs.offer(new Integer[]{ny, nx});
                            }
                        }
                    }
                }
            }
            if (ans < count) ans = count;
        }
        System.out.println(ans);


    }
}
