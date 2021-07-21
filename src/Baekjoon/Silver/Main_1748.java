package Baekjoon.Silver;

import java.util.Scanner;

public class Main_1748 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum  = 0;
        for(int i =1; i<=n; i++){
            sum += (int)(Math.log10(i)+1);
        }
        System.out.println(sum);
//        sum =0;
//        int len = (int)(Math.log10(n)+1);
//        int head = (int) (n/(Math.pow(10,len-1)));
//        for(int i = 1; i<len;i++){
//            if(len == 1) sum += n;
//            else sum += 9*(len-1)*Math.pow(10,len-2);
//        }
//        System.out.println(len+" "+head+" "+sum);


    }
}
