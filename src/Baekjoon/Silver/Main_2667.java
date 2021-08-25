package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main_2667 {
    public static void main(String args[]) throws IOException {
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N+1][N+1];

        for(int i = 1; i <= N; i++){
            String str = br.readLine();
            for(int j = 1; j<= N; j++){
                arr[i][j] = str.charAt(j-1) -'0';
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer []> queue = new LinkedList<>();
        boolean[][] visit = new boolean[N+1][N+1];
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                if(arr[i][j] == 1 && !visit[i][j]){
                    int count = 1;
                    visit[i][j] = true;
                    queue.offer(new Integer[]{i,j});
                    while(! queue.isEmpty()){
                        Integer[] tmp = queue.poll();
                        int x = tmp[0];
                        int y = tmp[1];
                        for(int k = 0; k<4; k++){
                            int nx = x+dx[k];
                            int ny = y+dy[k];

                            if(nx<1 || nx>N || ny<1 || ny>N) {
                                continue;
                            }

                            if(arr[nx][ny] == 1 && !visit[nx][ny]){
                                count++;
                                visit[nx][ny] = true;
                                queue.offer(new Integer[]{nx,ny});
                            }
                        }
                    }
                    ans.add(count);
                }

            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ans.size()+"\n");
        Collections.sort(ans);
        for(int i =0; i<ans.size(); i++){
            sb.append(ans.get(i) + " \n");
        }

        System.out.println(sb);


    }
}
