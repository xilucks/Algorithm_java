package Hello_algo.Day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class main_4680 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        TreeMap<String, Integer> hm = new TreeMap<>();
        for (int i = 0; i<n; i++){
            String str = br.readLine();
            if(hm.containsKey(str)) hm.replace(str,hm.get(str)+1);
            else hm.put(str,1);
        }

        int max = 0;
        String ans = "";
        for (String i : hm.keySet()){
            if(max < hm.get(i)){
                ans = i;
                max = hm.get(i);
            }
        }
        System.out.println(ans);
    }
}
