package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1654 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        long max = 0;
        for(int i = 0; i<K; i++){
            int tmp = Integer.parseInt(br.readLine());
            arr[i] = tmp;
            if(i == 0) max = tmp;
            else if(max < tmp) max = tmp;
        }

        long l = 0;
        long r = max;

        while(l<r){
            int total = 0;
            long mid = (l+r+1)/2;
            for(int i = 0; i<arr.length; i++){
                total += arr[i]/mid;
            }
            if(total >= N){
                l = mid;
            }
            else{
                r = mid-1;
            }
        }
        System.out.println(l);

    }
}
