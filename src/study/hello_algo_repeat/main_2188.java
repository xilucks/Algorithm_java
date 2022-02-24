package study.hello_algo_repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_2188 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int ans = -1;
        for(int i = 0; i*3<= N; i++){
            for(int j = 0; j*5 <=N; j++){
                int total = i*3 + j*5;
                if(total == N){
                    int box = i+j;
                    if(ans == -1 || ans > box ){
                        ans = box;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
