package Hello_algo.Day_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class main_4699 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        int C = Integer.parseInt(br.readLine());
        int [][] arr;
        int [][] firedist;
        int [][] dist;

        for(int i = 0; i < C; i++){
            Queue<Integer[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int sx = 0, sy = 0;
            arr = new int [r+1][c+1];
            firedist = new int[r+1][c+1];
            dist = new int[r+1][c+1];
            for (int j = 1; j <= r; j++){
                String str = br.readLine();
                for (int k = 1; k <= c; k++){
                    char ch = str.charAt(k-1);
                    if(ch == '.'){
                        arr[j][k] = 1;
                    }
                    if(ch == '@'){
                        sx = j;
                        sy = k;
                        arr[j][k] = 1;
                    }
                    if(ch == '*'){
                        queue.offer(new Integer[]{j,k});
                        firedist[j][k] = 1;
                        arr[j][k] = 1;
                    }
                }
            }

            while(! queue.isEmpty()){
                Integer[] tmp = queue.poll();
                int x = tmp[0];
                int y = tmp[1];

                for(int j = 0; j<4; j++){
                    int nx = x +dx[j];
                    int ny = y +dy[j];

                    if(nx < 1 || nx > r || ny < 1 || ny > c){
                        continue;
                    }
                    if(arr[nx][ny] == 1 && firedist[nx][ny] == 0){
                        firedist[nx][ny] = firedist[x][y]+1;
                        queue.offer(new Integer[]{nx,ny});
                    }
                }
            }

            queue.offer(new Integer[]{sx, sy});
            dist[sx][sy] = 1;
            int ans = Integer.MAX_VALUE;
            while(! queue.isEmpty()){
                Integer[] tmp = queue.poll();
                int x = tmp[0], y=tmp[1];
                for(int j = 0 ; j <4; j++){
                    int nx = x +dx[j];
                    int ny = y +dy[j];

                    if(nx < 1 || nx > r || ny <1 || ny>c){
                        ans = Math.min(ans, dist[x][y]+1);
                        continue;
                    }

                    if(arr[nx][ny] == 1 && dist[nx][ny] == 0 && (firedist[nx][ny]== 0 ||firedist[nx][ny] > dist[x][y]+1)){
                        dist[nx][ny] = dist[x][y]+1;
                        queue.offer(new Integer[]{nx, ny});
                    }
                }

            }
            if (ans == Integer.MAX_VALUE)
                sb.append("IMPOSSIBLE\n");
            else
                sb.append((ans - 1) + "\n");
        }
        System.out.println(sb);
    }
}
