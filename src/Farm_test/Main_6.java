package Farm_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_6 {
    public static void main(String args[]) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        double SW = (H-100)*(0.9);
        double B = W/SW*100;
        if((SW * 10)- (((int)SW) * 10) >0 ){
            sb.append(Math.round(SW*10)/10.0);
        }
        else{
            sb.append(Math.round(SW));
        }
        sb.append(" ");
        sb.append(Math.floor(B*100)/100);
        System.out.println(sb);
    }
}
