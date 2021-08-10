package Hello_algo.Day_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class main_4703 {
    static int H,W;
    static int arr[][];
    static boolean visited[][];
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        arr= new int [H+1][W+1];

        for(int i =1; i<= H; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1 ; j<=W; j++){
                arr[i][j]= Integer.parseInt(st.nextToken());
            }
        }
        int l = 0, r = 1000000000;
        while(l<r){
            int mid = (l+r)/2;

            if (dfs(mid)) {
                r = mid;
            }
            else  {
                l = mid+1;
            }
            }

        System.out.println(l);
        }




    public static boolean dfs(int k){
        Queue<Integer[]> queue = new LinkedList<>();
        visited = new boolean[H+1][W+1];
        queue.offer(new Integer[]{1,1});
        visited[1][1] = true;

        while(!queue.isEmpty()){
            Integer[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];

            for(int i = 0; i <4; i++){
                int nx = x +dx[i];
                int ny = y +dy[i];

                if(nx <1 || nx > H || ny < 1 || ny > W){
                    continue;
                }
                if(arr[nx][ny] <= arr[x][y] + k && visited[nx][ny] == false){
                    visited[nx][ny] = true;
                    queue.offer(new Integer[]{nx,ny});
                }
            }
        }
        return visited[H][W];
    }
}
