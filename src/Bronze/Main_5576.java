package Bronze;

import java.io.*;
import java.util.*;

public class Main_5576 {
    public static void main(String args[]) throws IOException {
        ArrayList<Integer> W = new ArrayList<>();
        ArrayList<Integer> K = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i =0; i<10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            W.add(Integer.parseInt(st.nextToken()));
        }
        for(int i =0; i<10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            K.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(W, Comparator.reverseOrder());
        Collections.sort(K, Comparator.reverseOrder());
        int sumW = W.get(0) + W.get(1) + W.get(2);
        int sumK = K.get(0) + K.get(1) + K.get(2);

        bw.write(sumW+" "+sumK);
        bw.flush();
        br.close();
        bw.close();
    }
}
