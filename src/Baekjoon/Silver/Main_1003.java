package Baekjoon.Silver;
//wrong
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main_1003 {
    static int zerosum = 0;
    static int onesum = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer[]> arr = new ArrayList<>();
    static Integer[] finbonacci(int n){
        Integer[] tmp = arr.get(n);
        int x = tmp[0];
        int y = tmp[1];
        if (n==0){
            return arr.get(n);
        }
        else if(n==1){
            return arr.get(n);
        }
        else if (x==0 && y ==0){
            Integer[] tp1 = finbonacci(n-1);
            Integer[] tp2 = finbonacci(n-2);
            int x1 = tp1[0];
            int x2 = tp2[0];
            int y1 = tp1[1];
            int y2 = tp2[1];
            int xtotal = x1+x2;
            int ytotal = y1+y2;
            arr.set(n, new Integer[]{xtotal,ytotal});
            return arr.get(n);
        }
        else{
            return arr.get(n);
        }



    }
    public static void main(String args[]) throws IOException {

        arr.add(new Integer[]{1,0});
        arr.add(new Integer[]{0,1});
        for(int i = 2 ; i<=41;i++){
            arr.add(new Integer[]{0,0});
        }
        int n = Integer.parseInt(br.readLine());
        for(int i =0 ;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            sb.append(Arrays.toString(finbonacci(x)).replace("[","").replace("]","").replace(",",""));
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
