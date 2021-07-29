package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_1620 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> hm = new HashMap<>();
        HashMap<String, String> hm2 = new HashMap<>();
        for(int i = 1; i<= N; i++){
            String name = br.readLine();
            String key = String.valueOf(i);
            hm.put(key, name);
            hm2.put(name,key);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<M; i++){//97,122
            String str = br.readLine();
            char ch = str.charAt(0);
            int n = (int)ch;
            if (n>=65 && n<=90){
                sb.append(hm2.get(str)+"\n");

            }
            else{
                sb.append(hm.get(str)+"\n");
            }

        }
        System.out.println(sb);
    }
}
