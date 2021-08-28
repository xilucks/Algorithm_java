package Farm_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] items = str.split(" ");
        int ans = 0;
        for(int i = 0 ; i <items.length-1;i++){
            for(int j = i+1; j< items.length; j++){
                if(items[i].equals(items[j])){
                    ans = 1;
                    break;
                }
            }
            if (ans == 1) break;
        }

        System.out.println(ans);
    }
}
