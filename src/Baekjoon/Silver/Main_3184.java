package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_3184 {
    public static void main(String args[]) throws IOException {
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        int o = 0;
        int v = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[][] arr = new char[R+1][C+1];
        int[][] visit = new int[R+1][C+1];
        for(int i = 1; i<= R; i++){
            String str = br.readLine();
            for(int j = 1; j<= C; j++){
                arr[i][j] = str.charAt(j-1);
            }
        }
        Queue<Integer[]> bfs = new LinkedList<>();

        for(int i = 1; i<=R; i++){
            for(int j = 1; j<=C; j++){
                if(arr[i][j] != '#' && visit[i][j] == 0){
                    visit[i][j] = 1;
                    bfs.add(new Integer[]{i,j});
                    int tmpo = 0;
                    int tmpv = 0;
                    while(!bfs.isEmpty()){
                        Integer[] tmp = bfs.poll();
                        int y = tmp[0];
                        int x = tmp[1];
                        if (arr[y][x] == 'o') tmpo += 1;
                        else if (arr[y][x] == 'v') tmpv +=1;
                        for(int k =0; k<4; k++){
                            int ny = y + dy[k];
                            int nx = x + dx[k];

                            if(ny < 1 || ny > R || nx<1 || nx>C){
                                break;
                            }
                            if(arr[ny][nx] != '#' && visit[ny][nx] == 0){
                                visit[ny][nx] = 1;
                                bfs.add(new Integer[] {ny,nx});
                            }
                        }

                    }

                    if(tmpo > tmpv){
                        o += tmpo;
                    }
                    else{
                        v += tmpv;
                    }
                }
            }
        }
        System.out.println(o+" "+v);

    }
}
