package Hello_algo.Day_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class main_2709 {
    public static void main(String args[]) throws IOException {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> brr = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n; i++){
            int x = Integer.parseInt(st.nextToken());
            arr.add(x);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            int x = Integer.parseInt(st.nextToken());
            brr.add(x);
        }

        Collections.sort(arr);
        Collections.sort(brr, Comparator.reverseOrder());
        int sum =0;
        for(int i = 0; i<n ; i++){
            sum += arr.get(i) * brr.get(i);
        }
        System.out.println(sum);
    }
}
