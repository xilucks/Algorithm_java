package Day_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_3370 {
    public static int[][] arr;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[100001][2];
        int n = Integer.parseInt(st.nextToken());
        int basedist = 0;
        for(int i =1;i<=n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        for(int i = 2; i<= n; i++){
            basedist += dist(i-1,i);
        }
        int ans = 999999999;
        for(int i = 2; i<n; i++){
            int total = basedist - dist(i,i+1) - dist(i-1,i) + dist(i-1,i+1);
            if (total < ans) ans = total;
        }
        System.out.println(ans);

    }
    public static int dist(int a, int b){
        return Math.abs(arr[a][0]-arr[b][0])+Math.abs(arr[a][1]-arr[b][1]);
    }
}
