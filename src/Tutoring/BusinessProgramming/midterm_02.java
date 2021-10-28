package Tutoring.BusinessProgramming;

import java.util.Scanner;

public class midterm_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 수를 입력하세요>>");
        int n = sc.nextInt();       // 학생의 수
        int i = 1;                  // 현재 몇 번째 학생이 입력되는지
        System.out.print("학생 " + i + " 성적을 입력하세요: >>");
        int score = sc.nextInt();      //학생 i번째 (첫번째)입력
        int total = score;          //평균 총점/인원수 => 총점 total
        while(i < n){               //i < n
            if(score<=100 && score >= 0){  // 반복문 돌리면서 올바른 입력을 했을 때,
                i++;                        // 인원수를 한 명 더해준다.
                total += score;             //더해줍니다.
                System.out.print("학생 " + i + " 성적을 입력하세요: >>"); //학생 n번째입력
                score = sc.nextInt();   //여기서 받고.
            }
            else{
                System.out.println("잘못된 성적입니다. 다시 입력 하세요:>>");
                score = sc.nextInt();   //여기서도 받고
            }
        }
        System.out.println("***************");
        System.out.println("학생 총 "+i+"명이며, 총점은 "+total+"점이며, 평균 성적은 "+total/i+"입니다.");
        System.out.println("***************");
    }
}
