package Hello_algo.Day_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class main_4284 {
    static int arr[][];
    static boolean visit[][];
    static int N, cnt;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, -1, 0, 1};


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new int[N+2][N+2];
        visit = new boolean[N+2][N+2];

        for (int i = 1; i<=N; i++){
            String str = br.readLine();
            for(int j = 1; j <= str.length(); j++){
                arr[i][j] = (int)(str.charAt(j-1) - '0');
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 1 ; i<= N; i++){
            for(int j = 1; j<=N; j++){
                if(arr[i][j] == 1 && visit[i][j] == false){
                    cnt = 0;
                    dfs(i,j);
                    ans.add(cnt);
                }
            }
        }
        sb.append(ans.size()+"\n");
        Collections.sort(ans);
        for(int i = 0; i<ans.size(); i++){
            sb.append(ans.get(i)+"\n");
        }
        System.out.println(sb);

    }

    public static void dfs(int x,int y){
        visit[x][y] = true;
        cnt ++;
        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 1 || nx > N || ny < 1 || ny > N){
                continue;
            }
            if(visit[nx][ny] == false && arr[nx][ny] == 1){
                dfs(nx,ny);
            }
        }
    }
}
