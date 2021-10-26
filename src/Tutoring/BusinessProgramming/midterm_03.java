package Tutoring.BusinessProgramming;

import java.util.Scanner;

public class midterm_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computer = 0;


        System.out.println("가위바위보 준비 되었습니다.");
        System.out.print("숫자를 입력하세요: (0 : 가위 , 1 : 바위 , 2 : 보) 의미합니다.");
        System.out.print("가위바위보>>");
        int me = sc.nextInt();

        System.out.println("********************");
        if(me == 1){
            System.out.println("당신이 승리하셨습니다.");
        }
        else if (me == 2){
            System.out.println("당신이 패배하였습니다.");
        }
        else{
            System.out.println("문제엔 없는데 비긴거겠죠 뭐");
        }
    }
}
