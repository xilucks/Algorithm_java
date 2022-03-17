package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_7569 {
    static int x = 0,y = 0,z = 0;
    static int[] dz = {-1,0,0,0,0,1};
    static int[] dy = {0,1,0,-1,0,0};
    static int[] dx = {0,0,1,0,-1,0};

    static Queue<Integer[]> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        z = Integer.parseInt(st.nextToken());

        // 입력 index
        int[][][] arr = new int[z][y][x];
        int[][][] dist = new int[z][y][x];

        for(int i = 0; i<z; i++){
            for(int j = 0; j<y; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k<x; k++){
                    int num = Integer.parseInt(st.nextToken());
                    arr[i][j][k] = num;
                    if(num == 1){
                        dist[i][j][k] = 1;
                        queue.offer(new Integer[]{i,j,k});
                    }
                }
            }
        }
        int ans = 0;

        while(!queue.isEmpty()){
            Integer[] tmp = queue.poll();

            int tmpz = tmp[0];
            int tmpy = tmp[1];
            int tmpx = tmp[2];

            for(int i = 0; i<dz.length; i++){
                int nz = tmpz + dz[i];
                int ny = tmpy + dy[i];
                int nx = tmpx + dx[i];

                if(nz < 0 || ny < 0 || nx <0 || nz >= z || ny >= y || nx >= x){
                    continue;
                }
                if(arr[nz][ny][nx] == 0 && dist[nz][ny][nx] == 0){
                    dist[nz][ny][nx] = dist[tmpz][tmpy][tmpx] + 1;
                    queue.offer(new Integer[] {nz,ny,nx});
                }
            }
        }

        boolean possible = true;

        for(int i = 0; i<z; i++){
            if (!possible) {
                ans = 0;
                break;
            }
            for(int j = 0; j<y; j++){
                for(int k = 0; k<x; k++){
                    if (!possible) {
                        ans = 0;
                        break;
                    }
                    if(arr[i][j][k] != -1&&dist[i][j][k] == 0) {
                        possible = false;
                        if (!possible) {
                            ans = 0;
                            break;
                        }
                    }
                    ans = Math.max(ans, dist[i][j][k]);
                }
            }
        }
//        <----Test---->
//        for(int i = 0; i<z; i++){
//            for(int j = 0; j<y; j++){
//                for(int k = 0; k<x; k++){
//                    System.out.print(dist[i][j][k]+" ");
//                }
//                System.out.println();
//            }
//        }

        System.out.println(ans-1);
    }










    }


