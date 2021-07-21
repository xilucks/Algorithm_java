package Baekjoon.Silver;

import java.util.Scanner;
import java.util.Stack;

public class Main_15815 {
    public static void main(String args[]){
        Stack<Integer> stack= new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum =0;
        int one,two;
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            switch (ch){
                case'+':
                    two = stack.pop();
                    one = stack.pop();
                    sum = one+two;
                    stack.push(sum);
                    break;
                case'-':
                    two = stack.pop();
                    one = stack.pop();
                    sum = one-two;
                    stack.push(sum);
                    break;
                case'*':
                    two = stack.pop();
                    one = stack.pop();
                    sum = one*two;
                    stack.push(sum);
                    break;
                case'/':
                    two = stack.pop();
                    one = stack.pop();
                    sum = one/two;
                    stack.push(sum);
                    break;
                default:
                    int n = ch - '0';
                    stack.push(n);
                    break;
            }
        }
        System.out.println(stack.peek());

    }
}
