package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long ans = cal(A,B,C);
        System.out.println(ans);
    }
    public static long cal(long x, long y, long z){
        if(y == 1) {
            return x%z;
        }

        long tmp = cal(x,y/2,z)%z;

        if(y % 2 == 0){
            return (tmp*tmp)%z;
        }
        else {
            return ((tmp*tmp)%z)*x%z;
        }
        }

}
