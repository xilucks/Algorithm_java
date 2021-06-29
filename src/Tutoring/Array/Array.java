package Tutoring.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int N = 5; // 제가 입력 받을 수의 개수
        int[] arr = new int[N];
        for(int i =0 ; i<N; i++){
            int tmp = sc.nextInt();
            arr[i] = tmp;
            if(max < tmp) {
                max = tmp;
            }
        }
        System.out.println("입력된 수에서 가장 큰 수는 " + max + "입니다.");
    }
}
