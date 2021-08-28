package Farm_test;

import javax.swing.text.html.StyleSheet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_5 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String year = str.substring(0,2);
        int Year = Integer.parseInt(year);
        char mill = str.charAt(7);
        int Mill = mill - '0';
        if(Mill<3){
            Year += 1900;
        }
        else{
            Year += 2000;
        }
        System.out.println(2020-Year+1);
    }
}
