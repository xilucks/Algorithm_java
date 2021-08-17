package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_7562 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int dy[]= {2,2,1,1,-2,-2,-1,-1};
        int dx[]= {1,-1,2,-2,1,-1,2,-2};
        int C = Integer.parseInt(br.readLine());
        for(int i = 0 ; i<C;i++){
            int S = Integer.parseInt(br.readLine());
            int[][] arr = new int[S][S];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ky = Integer.parseInt(st.nextToken());
            int kx = Integer.parseInt(st.nextToken());
            st= new StringTokenizer(br.readLine());
            int ty = Integer.parseInt(st.nextToken());
            int yx = Integer.parseInt(st.nextToken());

            Queue<Integer[]> queue = new LinkedList<>();
            arr[ky][kx] = 1;
            queue.offer(new Integer[] {ky,kx});

            while(! queue.isEmpty()){
                Integer [] tmp = queue.poll();
                int y = tmp[0];
                int x = tmp[1];

                for(int j = 0; j<dy.length; j++){
                    int ny = y +dy[j];
                    int nx = x+ dx[j];

                    if(nx < 0 || nx >= S || ny < 0 || ny >= S) continue;
                    if(arr[ny][nx] == 0){
                        arr[ny][nx] =arr[y][x] +1;
                        queue.offer(new Integer[] {ny,nx});
                    }
                }
            }

            sb.append(arr[ty][yx]-1);
            sb.append("\n");


        }
        System.out.println(sb);
    }
}
