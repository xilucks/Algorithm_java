package Hello_algo.Day_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class main_13 {
    static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0, 1, 0, -1};
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        int[][] len = new int[N][M];
        for(int i = 0 ; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                int x = ((int) str.charAt(j)) - 48;
                arr[i][j] = x;
            }
        }

        Queue<Integer[]> queue = new LinkedList<>();
        queue.offer(new Integer[] {0,0});
        len[0][0] = 1;

        while(!queue.isEmpty()){
            Integer[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if(arr[nx][ny] == 1 && len[nx][ny] == 0){
                    len[nx][ny] = len[x][y] + 1;
                    queue.offer(new Integer[] {nx,ny});
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if(len[N-1][M-1] == 0) sb.append(-1);
        else sb.append(len[N-1][M-1]);

        System.out.println(sb);



    }
}
