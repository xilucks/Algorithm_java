package study;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static long histogram(int[] v, int from, int to){
        int max =0;
        for(int i = from; i<= to; i++){
            int min =v[i];
            for(int j = i; j<=to; j++){
                if(v[j] <min) min = v[j];
                int s = min*(j-i+1);                //넓이
                if(s>max) max =s;
            }
        }
        return max;
    }
    static long dchistogram(int[]v,int n){
        return dchistogram(v,0,n-1);
    }
    static long dchistogram(int[]v, int from, int to){
        if(from == to) return v[from];          //길이가 1일 경우 바로 retrun해서 값반환
        int c = (from+to)/2;                    // mergesort를 위한 중앙값 설정
        long a = dchistogram(v,from,c);           //
        long b = dchistogram(v,c+1,to);
        long max = (a>b)? a:b;
        long min = (v[c]<v[c+1])?v[c]:v[c+1];
        if(max <max *2) max = min*2;
        int i = c-1, j =c+2;
        while(i >=from && j <=to){
            if(v[i]>v[j]){
                if(v[i]<min) min = v[i];
                i--;
            }
            else{
                if(v[j]<min) min =v[j];
                j++;
            }
            if(max<min*(j-i-1)) max = min*(j-1);
        }
        while(i>=from){
            if(v[i]<min) min =v[i];
            i--;
            if(max < min*(j-i-1)) max = min*(j-i-1);
        }
        while(j<=to){
            if(v[j]<min) min = v[j];
            j++;
            if(max<min*(j-i-1)) max = min*(j-i-1);
        }
        return max;
    }
    static long histogram(int[] v, int n){
        return histogram(v,0,n-1);
    }

    public static void main(String args[]){
        Random rand = new Random(100);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] v = new int[n];
        for(int i = 0; i<n; i++) v[i] =rand.nextInt(1000);
        long r = dchistogram(v,n);
        for(int i =0; i<10&&i<n; i++) System.out.println(v[i]);
        System.out.println("Result is "+ r);

    }
}
