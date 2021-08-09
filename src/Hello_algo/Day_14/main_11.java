package Hello_algo.Day_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_11 {
    static int N;
    static long M;
    static int[] arr;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());   // 나무 수
        M = Long.parseLong(st.nextToken());   // 목표길이
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(st.nextToken());
            arr[i] = x;
            if (x>max) max = x;
        }

        int l = 0; int r = max;

        while(l<r){
            int mid = (l+r+1)/2;

            if(check(mid)){
                l = mid;
            }
            else{
                r = mid - 1;
            }

        }

        System.out.println(l);

    }
    public static boolean check(int x) {
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i] >= x){
                sum += (arr[i] - x);
            }

        }
        if(sum >= M){
            return true;
        }
        else return false;
    }
}
