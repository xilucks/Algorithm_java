package Tutoring.BusinessProgramming;

import java.util.Random;
import java.util.Scanner;

public class forexam {
    public static void main(String[] args) {
//        int i = 1;
//        //조건하에 반복
//        while (i <= 10){
//            System.out.println(i);
//            i++;
//        }
        // 1~10 출력
        //범위
        //초기값, 조건, 증감요소
        //횟수를 지정해서 반복
//        for(int j = 1; j<= 10; j++){
//            System.out.println(j);
//        }
//        // i * j = i*j
//        for(int i = 1; i < 10;i++){
//            for(int j = 1 ; j < 10; j++){
//                System.out.print(i + " * " + j + " = " + i*j+"\t");
//           }
//            System.out.println("");
//        }
//
//
//        // 별찍기문제
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        //ex) 5
//
//        for(int i = 1; i<=N; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("/////////////////////////");
//        //continue break
//
//        for(int i = 0; i <= 100; i++){
//            if(i%2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }
//
//        System.out.println("/////////////////////////");

//        <타입> [] 배열의 이름 = new <타입>[배열의크기]
//        int[] arr = {0,1,2,3,4,5,6};
//
//        int[] arr2 = new int[100];
//
//        for(int i = 0 ; i<arr2.length; i++){
//            arr2[i] = i;
//        }

        Scanner sc = new Scanner(System.in);
//        int M = sc.nextInt();
//        int[] arr = new int[M];
//
//        for(int i = 0; i<M; i++){
//            int num = sc.nextInt();
//            arr[i] = num;
//        }
//
//        int min, max;
//        min = arr[0];
//        max = arr[0];
//
//        for(int i = 0; i<M; i++){
//            int tmp = arr[i];
//            if(tmp < min){
//                min = tmp;
//            }
//            if(tmp > max){
//                max = tmp;
//            }
//        }
//        System.out.println(min+" "+max);


        //8자리 ?? 7자리???
        int[] lotto = new int[6];
        int[] mynum = new int[6];
        Random rm = new Random();
        for(int i = 0; i<6; i++){
            lotto[i] = rm.nextInt(45)+1;
        }
        for(int i =0; i<6; i++){
            int num = sc.nextInt();
            mynum[i] = num;
        }
        int count = 0;
        for(int i = 0; i<6; i++){   //내 번호
            for(int j = 0; j<6; j++){
                if(lotto[i] == mynum[j]){
                    count++;
                    break;
                }
            }
        }
        for(int i = 0; i<6; i++){
            System.out.print(lotto[i]+"\t");
        }
        System.out.println();
        for(int i = 0; i<6; i++){
            System.out.print(mynum[i]+"\t");
        }
        System.out.println();
        System.out.println(count);


        int [] num = new int[6];    //로또번호

        for (int i=0;i<6;i++) {
            num[i] = rm.nextInt(45)+1;
            for(int j=0; j<i; j++) {
                if(num[j] == num[i]) {
                    i--;
                }
            }
        }
        for (int k=0;k<6;k++) {
            System.out.print(num[k]);
            System.out.print(" ");
        }








    }
}
