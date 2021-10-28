package Tutoring.BusinessProgramming;

import java.util.Scanner;

public class midterm_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("가로 길이: ");
        int w = input.nextInt();
        System.out.print("세로 길이: ");
        int h = input.nextInt();

        System.out.println("***************");
        System.out.print("직사각형의 넓이는 : " + w*h);
        System.out.print("직사각형의 둘래는 : " + 2*(w+h));
        System.out.println("***************");
    }
}
