package Tutoring.BusinessProgramming;

import java.util.Scanner;

public class midterm_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 수를 입력하세요>>");
        int n = sc.nextInt();
        int i = 1;
        System.out.print("학생 " + i + " 성적을 입력하세요: >>");
        int score = sc.nextInt();
        int total = score;
        while(i < n){
            if(score<100 && score >0){
                i++;
                total += score;
                System.out.print("학생 " + i + " 성적을 입력하세요: >>");
                score = sc.nextInt();
            }
            else{
                System.out.println("잘못된 성적입니다. 다시 입력 하세요:>>");
                score = sc.nextInt();
            }
        }
        System.out.println("***************");
        System.out.println("학생 총 "+i+"명이며, 총점은 "+total+"점이며, 평균 성적은 "+total/i+"입니다.");
        System.out.println("***************");
    }
}
