package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2512 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int max = -1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num > max) max = num;
            arr[i] = num;
        }
        int M = Integer.parseInt(br.readLine());
        int l = 0;
        int r = max;
        while(l<r){
            int mid = (l+r+1)/2;
            int sum = 0;
            for(int i = 0; i<N; i++){
                if(arr[i] < mid){
                    sum += arr[i];
                }
                else{
                    sum += mid;
                }
            }

            if(sum <= M){
                l = mid;
            }
            else{
                r = mid-1;
            }
        }
        System.out.println(l);
    }
}
