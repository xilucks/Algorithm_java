package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_9375 {
    public static void main(String args[]) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        for(int k = 0 ; k<C; k++){
            HashMap<String, Integer> hm = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            ArrayList<String> arr = new ArrayList<>();
            for(int i = 0; i<N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();
                if(! hm.containsKey(type)){
                    hm.put(type,2);
                    arr.add(type);
                }
                else{
                    hm.replace(type,hm.get(type)+1);
                }
            }

            int ans = 1;
            for(int i = 0; i<hm.size();i++){
                String str = arr.get(i);
                ans *= hm.get(str);
            }
            ans --;
            sb.append(ans+"\n");
        }
        System.out.println(sb);
    }
}
