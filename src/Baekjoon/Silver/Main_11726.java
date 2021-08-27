package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11726 {
    static long[] arr;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new long[1001];
        System.out.println(cal(N));
    }

    static long cal(int x){
        if(x == 1){
            arr[x] = 1;
            return arr[x];
        }
        else if (x==2){
            arr[x] = 2;
            return arr[x];
        }
        else if(arr[x] != 0){
            return arr[x];
        }
        else{
            arr[x] = cal(x-2)+cal(x-1);
            return arr[x]%10007;
        }
    }
}
