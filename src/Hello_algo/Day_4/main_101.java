package Hello_algo.Day_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Hello_Algo 101_스택
public class main_101 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int top = -1;
        int[] arr = new int[100000];
        String str = "";
        while (!str.equals("end")){
            str = sc.next();
            switch (str) {
                case "push":
                    top ++;
                    int n = sc.nextInt();
                    arr[top] = n;
                    System.out.println(arr[top]);
                    break;

                case "pop":
                    if(top == -1) System.out.println(top);
                    else {
                        System.out.println(arr[top]);
                        top--;
                    }
                    break;

                case "size":
                    System.out.println(top+1);
                    break;

                case "empty":
                    if(top == -1) System.out.println(1);
                    else System.out.println(0);
                    break;

                case "top":
                    if(top != -1) {
                        System.out.println(arr[top]);
                    }
                    else{
                        System.out.println(top);
                    }
                    break;


            }
        }
    }
}
