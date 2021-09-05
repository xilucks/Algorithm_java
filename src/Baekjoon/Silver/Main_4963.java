package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_4963 {
    public static void main(String args[]) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr;
        boolean[][] visit;
        int ans;
        Queue<Integer[]> queue;
        int[] dy = {1,0,-1,0,1,-1,1,-1};
        int[] dx = {0,1,0,-1,1,-1,-1,1};
        int x,y;
        while(true){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            ans = 0;
            if(x == 0 && y == 0){
                break;
            }
            queue = new LinkedList<>();
            arr = new int[y+1][x+1];
            visit = new boolean[y+1][x+1];
            for(int i = 1 ;i<=y; i++){
                String[] str = br.readLine().split(" ");
                for(int j = 1; j<= x; j++){
                    arr[i][j] = Integer.parseInt(str[j-1]);

                }
            }
            for(int i = 1; i<=y; i++){
                for(int j = 1; j<=x; j++){
                    if(! visit[i][j] && arr[i][j] == 1) {
                        ans++;
                        visit[i][j] = true;
                        queue.offer(new Integer[]{i, j});


                        while (!queue.isEmpty()) {
                            Integer[] tmp = queue.poll();
                            int tmpy = tmp[0];
                            int tmpx = tmp[1];
                            visit[tmpy][tmpx] = true;


                            for (int k = 0; k < 8; k++) {
                                int ny = tmpy + dy[k];
                                int nx = tmpx + dx[k];


                                if (nx < 1 || nx > x || ny < 1 || ny > y) {
                                    continue;
                                }
                                if (arr[ny][nx] == 1 && !visit[ny][nx]) {
                                    visit[ny][nx] = true;
                                    queue.offer(new Integer[]{ny, nx});

                                }
                            }

                        }
                    }
                }
            }
            sb.append(ans+"\n");
        }
        System.out.println(sb);
    }
}
