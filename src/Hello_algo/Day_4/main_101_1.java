package Hello_algo.Day_4;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

// Hello_Algo 101_스택
public class main_101_1 {
    public static void main(String args[]) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (!str.equals("end")){
            str = sc.next();
            switch (str) {
                case "push":
                    int n = sc.nextInt();
                    stack.push(n);
                    bw.write(stack.peek()+"\n");
                    break;

                case "pop":
                    if(stack.empty()) bw.write(-1+"\n");
                    else {
                        bw.write(stack.pop()+"\n");
                    }
                    break;

                case "size":
                    bw.write(stack.size()+"\n");
                    break;

                case "empty":
                    if(stack.empty()) bw.write(1+"\n");
                    else bw.write(0+"\n");
                    break;

                case "top":
                    if(stack.empty()) {
                        bw.write(-1+"\n");
                    }
                    else{
                        bw.write(stack.peek()+"\n");
                    }
                    break;


            }
        }
        bw.flush();

    }
}
