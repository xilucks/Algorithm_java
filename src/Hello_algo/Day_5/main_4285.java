package Hello_algo.Day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class main_4285 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int cardnum = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i <cardnum; i++){
            int card = Integer.parseInt(st.nextToken());
            if (hm.containsKey(card)) hm.replace(card, hm.get(card)+1);
            else hm.put(card, 1);
        }
        StringBuilder sb = new StringBuilder();
        int qnum = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i =0 ; i<qnum; i++){
            int question = Integer.parseInt(st.nextToken());
            if(hm.containsKey(question)) {
                sb.append(hm.get(question)+" ");
            }
            else {
                sb.append(0+" ");
            }

        }
        System.out.println(sb);

    }
}
