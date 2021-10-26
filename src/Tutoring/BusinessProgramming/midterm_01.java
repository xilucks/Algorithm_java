package Tutoring.BusinessProgramming;

import java.util.Scanner;

public class midterm_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 길이: ");
        int width = sc.nextInt();
        System.out.print("세로 길이: ");
        int height = sc.nextInt();
        System.out.println("***************");
        System.out.println("직사각형의 넓이는 : "+width*height);
        System.out.println("직사각형의 둘래는 : "+ 2*width + 2*height);
        System.out.println("***************");
    }
}
