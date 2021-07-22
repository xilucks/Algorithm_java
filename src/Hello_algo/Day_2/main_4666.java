package Hello_algo.Day_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class main_4666 {
    public static void main(String args[]) throws IOException {
        ArrayList<Long> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Integer.parseInt(st.nextToken());
        for(long i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            long num = Long.parseLong(st.nextToken());
            list.add(num);
        }

        Collections.sort(list);
        for(Long i : list) {
            bw.write(i+"\n");
        }

        bw.flush();

    }
}
