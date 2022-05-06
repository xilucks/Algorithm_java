package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_14425 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> hm = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i<N; i++){
            String str = br.readLine();
            hm.put(str, 0);
        }

        for(int i = 0; i<M; i++) {
            String check = br.readLine();
            if (hm.containsKey(check)) {
                hm.put(check, hm.get(check) + 1);
            }
        }

        int ans = 0;

        for(int i : hm.values()){
            ans += i;
        }

        System.out.println(ans);
    }
}
