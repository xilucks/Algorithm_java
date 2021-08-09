package Hello_algo.Day_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_2907 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[]arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        int T = Integer.parseInt(br.readLine());

        int S = 0, E = N;

        while(S < E){
            int m = (S+E)/2;
            if(arr[m] < T){
                S = m+1;
            }
            else if (arr[m] > T){
                E = m;
            }
            else if (arr[m] == T){
                E = m;
            }
        }
        int result = 0;

        System.out.println(S+1);

    }
}
