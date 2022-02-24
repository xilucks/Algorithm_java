package study.hello_algo_repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2123 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0 ;
        for(int i = 0; i <N; i++){
            for (int j = i+1; j<N; j++){
                for(int k = j+1; k<N; k++){
                    int total = nums[i] + nums[j]+ nums[k];
                    if(total == 0 || total <= M && total >ans){
                        ans = total;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
