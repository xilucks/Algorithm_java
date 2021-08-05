package Hello_algo.Day_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class main_4698 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int c = Integer.parseInt(br.readLine());    //테스트 케이스

        int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};

        for(int i = 0; i<c; i++) {
            int l = Integer.parseInt(br.readLine());    //체스판 길이 l*l
            st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());      //startX
            int sy = Integer.parseInt(st.nextToken());      //startY
            st = new StringTokenizer(br.readLine());
            int tx = Integer.parseInt(st.nextToken());      //targetX
            int ty = Integer.parseInt(st.nextToken());      //targetY


            int[][] dist = new int[l][l];

            Queue<Integer[]> queue= new LinkedList<>();
            queue.offer(new Integer[] {sx, sy});
            dist[sx][sy] = 1;

            while(!queue.isEmpty()){
                Integer [] tmp = queue.poll();
                int x = tmp[0];
                int y = tmp[1];

                for(int I = 0; I <8; I++){
                    int nx = x + dx[I];
                    int ny = y + dy[I];

                    if(nx < 0 || nx >= l || ny < 0 || ny >= l) continue;
                    if(dist[nx][ny] == 0){
                            dist[nx][ny] = dist[x][y] + 1;
                            queue.offer(new Integer[] {nx,ny});
                    }


                }
            }

            sb.append(dist[tx][ty]-1);
            sb.append("\n");

        }
        System.out.println(sb);

    }
}
