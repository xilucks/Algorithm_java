package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();
        int tmp = 1;
        int ans = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push(ch);
                tmp *= 2;
            }
            else if (ch == ')'){
                if (stack.isEmpty() || stack.peek() == '['){
                    ans = 0;
                    break;
                }
                if (str.charAt(i-1) == '('){
                    ans += tmp;
                }
                stack.pop();
                tmp /= 2;
            }
            else if (ch == '['){
                stack.push(ch);
                tmp *= 3;
            }
            else {
                if (stack.isEmpty() || stack.peek() == '('){
                    ans = 0;
                    break;
                }
                if (str.charAt(i-1) == '['){
                    ans += tmp;
                }
                stack.pop();
                tmp /= 3;
            }
        }

        if(! stack.isEmpty()){
            ans = 0;
        }
        System.out.println(ans);
    }
}
