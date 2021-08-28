package Farm_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_4 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] items = str.split(" ");
        int ans = 0;
        int A = Integer.parseInt(items[0]);
        int B = Integer.parseInt(items[1]);
        if(items[2].equals("+")){
            ans = A+B;
        }
        else if(items[2].equals("-")){
            ans = A-B;
        }
        else if(items[2].equals("*")){
            ans = A*B;
        }
        else if(items[2].equals("/")){
            ans = A/B;
        }

        System.out.println(ans);


    }
}
