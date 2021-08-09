package Hello_algo.Day_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class main_1239 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        ArrayList<Integer> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i ++){
            int x = Integer.parseInt(st.nextToken());
            al.add(x);
        }

        Collections.sort(al);


        for(int i = 0; i<Q; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int s = 0; int e = N;
            while(s<e){
                int mid = (s+e)/2;
                if(al.get(mid) < x){
                    s = mid+1;
                }
                else{
                    e = mid;
                }
            }

            int ansX = s;

            s = 0; e= N;
            while(s<e){
                int mid = (s+e)/2;
                if(al.get(mid) <= y){
                    s = mid+1;
                }
                else{
                    e = mid;
                }
            }

            int ansY = s;

            sb.append(ansY - ansX);
            sb.append("\n");


        }
        System.out.println(sb);
    }
}
