package Hello_algo.Day_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class main_768 {
    public static void main(String args[]) throws IOException {
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer[]> queue = new LinkedList<>();

        int M = Integer.parseInt(st.nextToken());       //세로
        int N = Integer.parseInt(st.nextToken());       //가로

        int[][] arr = new int[M+1][N+1];
        int[][] dist = new int[M+1][N+1];

        for(int i = 1; i <= M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++){
                int x = Integer.parseInt(st.nextToken());
                if(x == 0){
                    arr[i][j] = 1;
                }
                if(x == 1){
                    queue.offer(new Integer[]{i,j});
                    arr[i][j] = 1;
                    dist[i][j] = 1;

                }

            }
        }
        int ans = 0;

        while(!queue.isEmpty()){
            Integer[] tmp = queue.poll();
            int x = tmp[1];
            int y = tmp[0];

            for(int i = 0; i<4; i++){
                int nx = x +dx[i];
                int ny = y +dy[i];

                if(nx < 1 || nx > N || ny < 1 || ny > M){
                    continue;
                }

                if(arr[ny][nx] == 1 && dist[ny][nx] == 0){
                    ans = Math.max(ans, dist[y][x]+1);
                    dist[ny][nx] = dist[y][x] + 1;
                    queue.offer(new Integer[]{ny,nx});
                }
            }
        }
        boolean bl = true;
        for(int i = 0; i <= M; i++){
            for (int j = 0 ; j <= N; j++){
                if(arr[i][j] ==1 && dist[i][j] == 0) {
                    bl = false;
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (bl == false)
            sb.append(-1+ "\n");
        else
            sb.append((ans - 1) + "\n");

        System.out.println(sb);




    }
}
