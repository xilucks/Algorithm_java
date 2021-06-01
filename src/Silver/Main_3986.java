package Silver;

import java.util.Scanner;
import java.util.Stack;

public class Main_3986 {
    static boolean judgment(String str) {
        int size = str.length();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < size; i++) {
            char top = str.charAt(i);
            if (i == 0) stack.push(str.charAt(i));
            else {
                if (stack.empty()==false&&stack.peek() == top) {
                    stack.pop();
                } else {
                    stack.push(top);
                }
            }
        }
        if (stack.empty()) {
            return true;
        }

        return false;
    }
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        String str;
        for(int i =0; i<n; i++){
            str = sc.next();
            if(judgment(str) == true) result++;
        }
        System.out.println(result);
    }
}
