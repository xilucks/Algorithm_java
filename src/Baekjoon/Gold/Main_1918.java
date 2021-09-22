package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main_1918 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> ans = new ArrayList<>();
        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for (int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            int p = cal(ch);
            if(ch == '+' || ch == '-'|| ch == '*' || ch == '/'){
                while (!stack.isEmpty() && cal(stack.peek()) >= p ){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
            else if (ch == '('){
                stack.push(ch);

            }
            else if (ch == ')'){
                while(! stack.isEmpty()){
                    char tmp = stack.peek();
                    if(tmp == '('){
                        stack.pop();
                        break;
                    }
                    else{
                        sb.append(stack.pop());
                    }
                }
            }
            else{
                sb.append(ch);
            }

        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);

    }

    public static int cal(char ch){
        switch (ch){
            case '*' :
            case '/' :
                return 2;
            case '+' :
            case '-' :
                return 1;
            case '(':
            case ')':
                return 0;

        }
        return -1;
    }
}
//A*b-C   == AB*C-
