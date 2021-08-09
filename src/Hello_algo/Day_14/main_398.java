package Hello_algo.Day_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_398 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   //수열의 길이
        int M = Integer.parseInt(st.nextToken());   //문제의 개수

        int[] arr = new int[N];

        st= new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(st.nextToken());
            arr[i]= x;
        }
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            boolean ans = false;
            int l = 0;
            int r = N-1;
            int q = Integer.parseInt(st.nextToken());

            while (l < r){
                int mid = (l+r+1)/2;
                if(q < arr[mid]){
                    r = mid-1;
                }
                else if (q>=arr[mid]){
                    l = mid;
                }



            }
            if(q == arr[l]){
                ans = true;
            }


            if(ans == true){
                sb.append(1 + "\n");
            }
            else{
                sb.append(0 + "\n");
            }
        }
        System.out.println(sb);



    }
}
