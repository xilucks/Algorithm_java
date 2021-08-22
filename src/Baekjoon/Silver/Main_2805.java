package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2805 {
    static int N,M;
    static int[] arr;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        for(int i = 1 ; i <= N; i++ ){
            int tmp = Integer.parseInt(st.nextToken());
            arr[i] = tmp;
            if(max < tmp) {
                max = tmp;
            }
        }
        int l = 0;
        int r = max;

        while(l<r){
            int mid = (l+r+1)/2;
            if(chk(mid)) l = mid;
            else r = mid-1;

        }
        System.out.println(l);
    }
    static boolean chk(int x){
        long sum = 0;
        for(int i = 1; i<= N; i++){
            if(arr[i] >= x){
                sum += (arr[i]-x);
            }
        }
        if(sum >= (long) M){
            return true;
        }
        else{
            return false;
        }
    }
}
