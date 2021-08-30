package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_16953 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        int count = 1;

        while(true) {
            if(B%10 ==1){
                B /=10;
                count++;
            }
            else if(B%2 == 0){
                B /=2;
                count++;
            }
            else{
                break;
            }

            if(B <= A){
                break;
            }

        }
        if( B !=A || count ==1){
            System.out.println(-1);
        }
        else{
            System.out.println(count);
        }
    }
}
