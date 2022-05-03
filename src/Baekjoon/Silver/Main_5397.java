package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        for(int i = 0; i<c; i++){
            String str = br.readLine();

            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();
            for(int j = 0; j <str.length(); j++){
                char ch = str.charAt(j);

                if(ch == '<'){
                    if (!left.isEmpty()) right.push(left.pop());
                }
                else if(ch == '>'){
                    if(!right.isEmpty()) left.push(right.pop());
                }
                else if(ch =='-'){
                    if(!left.isEmpty())left.pop();
                }
                else{
                    left.push(ch);
                }
            }
            while(! right.isEmpty()){
                left.push(right.pop());
            }
            System.out.println(left.toString().replace("[","").replace(",","").replace("]", "").replace(" ", "").trim());
        }
    }
}
