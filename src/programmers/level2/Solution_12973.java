package programmers.level2;

import java.util.Stack;

public class Solution_12973 {
    public static int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(stack.isEmpty()) stack.push(ch);
            else{
                if(stack.peek() == ch) stack.pop();
                else stack.push(ch);
            }
        }
        if(stack.isEmpty()) answer = 1;
        else answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("cdcd"));
    }
}
