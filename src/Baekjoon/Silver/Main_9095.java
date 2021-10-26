package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        int[] tmp = new int[N];
        for(int i = 0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            tmp[i] = n;
            if(max<n) max = n;

        }
        int[] arr = new int[max+1];
        for(int i =0; i<=max; i++){
            if(i == 0) arr[i] = 0;
            else if(i == 1)arr[i] = 1;
            else if(i == 2)arr[i] = 2;
            else if(i == 3)arr[i] = 4;
            else arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<tmp.length; i++){
            int tmpnum = tmp[i];
            sb.append(arr[tmpnum]+"\n");
        }
        System.out.println(sb);
    }
}
