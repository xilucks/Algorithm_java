package Hello_algo.Day_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_4312 {
    static int N,M;
    static int[]arr;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());   //사람명수
        M = Integer.parseInt(st.nextToken());   //얼음개수
        arr = new int[M];
        int max = 0;
        for(int i = 0; i< M ; i++){
            int x = Integer.parseInt(br.readLine());
            arr[i] = x;
            if (x > max) max = x;
        }
        int l = 0 ; int r = max;

        while(l<r){
            int mid = (l+r+1)/2;

            if(chk(mid) >= N){
                l = mid;
            }
            else{
                r = mid-1;
            }

        }
        System.out.println(l);
    }
    public static int chk(int x){
        int cnt = 0;
        for(int i = 0; i<M; i++){
            if(arr[i] >= x){
                cnt += arr[i]/x ;
            }
        }
        return cnt;
    }
}
