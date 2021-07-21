package Baekjoon.Silver;
//wrong
import java.io.*;
import java.util.StringTokenizer;

public class Main_1003 {
    static int zerosum = 0;
    static int onesum = 0;

    static int finbonacci(int n,int []arr){
        if(n == 0){
            zerosum++;
            return arr[0];
        }
        else if(n == 1){
            onesum++;
            return arr[1];
        }
        else if (arr[n] != 0){
            return arr[n];
        }
        else {
            return arr[n] = finbonacci(n-1,arr)+finbonacci(n-2,arr);
        }
    }
    public static void main(String args[]) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[41];
        for(int i = 0; i<n; i++) {
            zerosum = 0;
            onesum = 0;
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            finbonacci(k,arr);
            bw.write(zerosum + " " + onesum+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
