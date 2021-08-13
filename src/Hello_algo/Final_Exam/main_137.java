package Hello_algo.Final_Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_137 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int K = Integer.parseInt(br.readLine());    //폭탄 소유 사람
        int N = Integer.parseInt(br.readLine());    //질문의 개수
        int[] arr = new int[N];
        String[] brr = new String[N];
        int time = 0;
        for (int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            String a = st.nextToken();
            arr[i] = t;
            brr[i] = a;
        }

        int limit = 210;
        int i = -1;
        int ans = K;
        while(time <limit){
            i++;
            int at = arr[i%8];
            String an = brr[i%8];
            time += at;
            if(time >= limit) break;
            if(an.equals("T")){
                ans ++;
            }



        }
        if((ans)%8 ==0){
            ans = 8;
        }
        else{
            ans = (ans)%8;
        }
        System.out.println(ans);

    }
}
