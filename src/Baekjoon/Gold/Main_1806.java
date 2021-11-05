package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int l = 0;
        int r = 0;
        int sum = arr[0];
        int ans = Integer.MAX_VALUE;
        while(l<=r && r < N){
            if(sum < S){
                r++;
                if(r>=N) continue;
                sum += arr[r];
            }
            else{
                ans = Math.min(r-l+1, ans);
                sum -= arr[l];
                l++;

            }
        }
        if(ans == Integer.MAX_VALUE) ans = 0;
        System.out.println(ans);
    }
}
