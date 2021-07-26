package Hello_algo.Day_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class main_2782 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        Stack <Integer> stack = new Stack<>();
        int sum = 0;
        for (int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if(num != 0){
                sum += num;
                stack.push(num);
            }
            else{
                sum -= stack.pop();
            }
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
