package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1932 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        int[] tmp = new int[N+1];
        int first = Integer.parseInt(br.readLine());
        tmp[1] = first;
        arr[1] = first;
        for(int i = 2; i<= N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= i; j++ ){
                tmp[j] = Integer.parseInt(st.nextToken());
            }
            for(int j = 1; j <= i; j++ ){
                tmp[j] = Integer.max(tmp[j]+arr[j-1],tmp[j]+arr[j]);

            }
            for(int j = 1; j <= i; j++ ){
                arr[j] = Integer.max(tmp[j],tmp[j]-1);
            }

        }
        int ans = Integer.MIN_VALUE;
        for(int i = 1; i<arr.length; i++){
            ans = Integer.max(arr[i],ans);
        }
        System.out.println(ans);
    }
}
