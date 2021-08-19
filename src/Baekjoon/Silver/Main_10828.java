package Baekjoon.Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            }
            if (str.equals("pop")) {
                if (stack.empty()) {
                    sb.append("-1\n");
                    continue;
                }
                int x = stack.pop();
                sb.append(x + "\n");
            }
            if (str.equals("size")) {
                int x = stack.size();
                sb.append(x + "\n");
            }
            if (str.equals("empty")) {
                Boolean isEmpty = stack.empty();
                if (isEmpty)
                    sb.append("1\n");
                else
                    sb.append("0\n");
            }
            if (str.equals("top")) {
                if (stack.empty()) {
                    sb.append("-1\n");
                    continue;
                }
                int x = stack.peek();
                sb.append(x + "\n");
            }

        }
        System.out.println(sb.toString());
    }
}