package Hello_algo.Final_Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main_293 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[46];
        int T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= 45; i++){
            arr[i] = i*(i+1)/2;
        }
        int[] ans = new int [5000];
        for(int i = 1 ; i <= 45; i++){
            for(int j = 1; j <=45; j++){
                for(int k = 1; k <=45; k++){
                    int x = arr[i]+ arr[j]+arr[k];
                    ans[x] = 1;
                }
            }
        }
        for(int i = 0 ; i<T; i++){
            int k = Integer.parseInt(br.readLine());
            sb.append(ans[k]+"\n");

        }
        System.out.println(sb);
    }
}
