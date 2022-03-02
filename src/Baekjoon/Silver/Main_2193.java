package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] arr = new long[N+1];

        long x = 1;
        long y = 0;

        for(int i = 1; i<=N; i++){

            if(i == 1 || i == 2 ){
                arr[i] = 1;
            }
            else if(i == 3){
                long v = (2*x + y);
                arr[i] = v;
            }
            else{
                long tmp = x;
                x = tmp+y;
                y = tmp;
                long v = 2*x + y;
                arr[i] = v;
            }
        }
        System.out.println(arr[N]);


    }
}
