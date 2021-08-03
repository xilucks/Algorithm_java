package Day_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_553 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int sum = 0;
        int[][] arr = new int[n][2];    //[][0] == localindex //[][1] ==colorindex
        for(int i = 0; i< n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int i =0; i < n ; i++){
            int min = 9999999;
            for(int j = 0; j < n; j++){
                if(arr[i][1] == arr[j][1] && Math.abs(arr[i][0] - arr[j][0]) < min && i != j){
                    min = Math.abs(arr[i][0] - arr[j][0]);
                }
            }
            sum += min;

        }
        System.out.println(sum);
    }
}
