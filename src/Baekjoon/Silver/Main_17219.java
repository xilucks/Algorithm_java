package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_17219 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> hm = new HashMap<>();

        for(int i = 0; i<N; i++){
            String str = br.readLine();
            String[] strs = str.split(" ");
            String site =strs[0];
            String id = strs[1];
            hm.put(site,id);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<M; i++){
            String site = br.readLine();
            sb.append(hm.get(site)+"\n");
        }
        System.out.println(sb);
    }
}
