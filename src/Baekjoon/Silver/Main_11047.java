package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11047 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        int top = 0;
        for(int i = 0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            if(n > K){
                break;
            }
            else{
                arr[i] = n;
                top++;
            }
        }

        int ans = 0;
        while(K != 0){
            top --;
            if(top <0){
                break;
            }
            if(K/arr[top] !=0){
                int tmp = K/arr[top];
                ans += tmp;
                K -= arr[top] * tmp;
            }
            else{
                continue;
            }
        }
        System.out.println(ans);
    }
}
