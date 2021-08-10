package Hello_algo.Day_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main_4341 {
    static ArrayList<Integer> arr;
    static int N, M, L;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());   // 휴게수 개수
        M = Integer.parseInt(st.nextToken());   // 더 지어야하는 개수
        L = Integer.parseInt(st.nextToken());   // 고속도로 길이

        arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(st.nextToken());
            arr.add(x);
        }

        int l = 1;
        int r = L;
        while(l < r){
            int mid =(l+r+1)/2;
            if(chk(mid)) r = mid;
            else l = mid+1;
        }
        System.out.println(l);

    }

    public static boolean chk(int x){
        int now = 0;
        int cnt = 0;
        for(int i = 0; i< N ; i++){
            int tmp = arr.get(i)- now;
            cnt += (tmp -1)/x;
            now = arr.get(i);
        }
        cnt += (L - now -1 )/x;
        if(cnt <= M){
            return true;
        }
        else return false;

    }
}
