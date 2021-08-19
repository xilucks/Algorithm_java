package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_17298 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tmp = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            tmp.push(num);
            }

        for(int i = 0; i< N; i++){
            int num = tmp.pop();
            if(i == 0 || stack.isEmpty()){
                stack.push(num);
                //sb.append(-1 + " ");
                ans.push(-1);
            }
            else{
                if(num < stack.peek()){
                    //sb.append(stack.peek()+" ");
                    ans.push(stack.peek());
                    stack.push(num);
                }
                else{
                    while(!stack.isEmpty() && (num >= stack.peek())){
                        stack.pop();
                    }
                    if(stack.isEmpty()){
                        //sb.append(-1+" ");
                        ans.push(-1);
                        stack.push(num);
                    }
                    else{
                        //sb.append(stack.peek()+" ");
                        ans.push(stack.peek());
                        stack.push(num);
                    }

                }
            }
        }

        while(! ans.isEmpty()){
            sb.append(ans.pop()+" ");
        }



        System.out.println(sb);


    }
}
