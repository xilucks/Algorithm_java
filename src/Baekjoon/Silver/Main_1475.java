package Baekjoon.Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1475 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[11];
        for(int i = 0; i< str.length(); i++){
            int n = (int) str.charAt(i) -'0';
            arr[n] ++;
        }

        if ((arr[6]+arr[9])%2 != 0) {
            arr[10] = (arr[6]+arr[9])/2 +1;
        }
        else {
            arr[10] = (arr[6]+arr[9])/2;
        }
        arr[6] = 0;
        arr[9] = 0;
        Arrays.sort(arr);
        System.out.println(arr[10]);
    }
}
